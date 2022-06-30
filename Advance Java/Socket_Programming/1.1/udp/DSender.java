//DSender
import java.net.*;
import java.util.*;
public class DSender {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        DatagramSocket ds = new DatagramSocket();
        InetAddress ip = InetAddress.getByName("localhost"); //127.0.0.1

        System.out.print("Client message :");
        String str = sc.nextLine();

        DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),ip,3000);
        ds.send(dp);

        ds.close();
    }
}