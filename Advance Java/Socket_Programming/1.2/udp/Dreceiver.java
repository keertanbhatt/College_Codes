import java.io.*;
import java.util.*;
import java.net.*;
import java.lang.*;

public class Dreceiver {
    public static void main(String args[]) throws Exception {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket(3000);
        DatagramSocket ds1 = new DatagramSocket();
        String str;
        while (true) {
            System.out.println();
            byte[] buf = new byte[1024];
            DatagramPacket dp = new DatagramPacket(buf, 1024);
            ds.receive(dp);
            str = new String(dp.getData(), 0, dp.getLength());
            
            if (str.equals("end")) {
                System.out.println("System: Connection Terminated by Sender!\n");
                System.exit(0);
            }
            else {
                System.out.println(i+"] Sender Says :"+str);

                
                System.out.print(i+"] Enter Your msg :");
                str = sc.nextLine();
                InetAddress ip = InetAddress.getByName("localhost");
                DatagramPacket dp1 = new DatagramPacket(str.getBytes(), str.length(), ip, 8898);
                
                if (str.equals("end")) {
                    System.out.println("System: Connection Terminated by Receiver!\n");
                    ds1.send(dp1);
                    System.exit(0);
                }
                else {
                    ds1.send(dp1);
                }
                
            }
            i++;
        }
    }
}