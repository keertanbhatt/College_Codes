import java.net.*;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Dsender {
    public static void main(String args[]) throws Exception {
        
        
        Scanner sc = new Scanner(System.in);
        int i = 1;
        String str;
        InetAddress ip = InetAddress.getByName("localhost");
        byte[] buf;

        DatagramSocket ds1 = new DatagramSocket(8898);
        DatagramSocket ds = new DatagramSocket();

        while (true) {
            System.out.println();
            System.out.print(+i+"] Your msg :");
            str = sc.nextLine();

            DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
            //termination condition
            if (str.equals("end")) {
                System.out.println("System: Connection Terminated by Sender!\n");
                ds.send(dp);
                System.exit(0);
            } else {
                ds.send(dp);

                
                buf = new byte[1024];


                DatagramPacket dp1 = new DatagramPacket(buf, 1024);
                dp1.setLength(buf.length);
                ds1.receive(dp1);

                str = new String(dp1.getData(), 0, dp1.getLength());
                //String condition
                if (str.equals("end")) {
                    System.out.println("System: Connection Terminated by Receiver!\n");
                    System.exit(0);
                } else {
                    System.out.println(i+"] receiver says :" + str);
                }

            }
            i++;
        }
    }
}