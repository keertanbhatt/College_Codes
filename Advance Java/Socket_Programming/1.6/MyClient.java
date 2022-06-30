import java.io.*;
import java.net.*;
import java.util.*;

public class MyClient {
    public static void main(String args[]) {
        try {
            
            Socket s = new Socket("localhost",1111);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            String str = "MALAYALAM";
            dout.writeUTF(str);

            str = (String)din.readUTF();
            DataInputStream din = new DataInputStream(s.getInputStream());
            System.out.println("Response from server:"+str);
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
