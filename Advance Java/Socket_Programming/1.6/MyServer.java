import java.io.*;
import java.net.*;
import java.util.*;



public class MyServer {
    public static void main(String args[]) {
        try {
            
            ServerSocket ss = new ServerSocket(1111);
            Socket s = ss.accept();
            
            DataInputStream din = new DataInputStream(s.getInputStream());
            String str = (String)din.readUTF();
            System.out.println("Client says :"+str);

            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            StringBuilder sb=new StringBuilder(str);  
            sb.reverse();  
            String rev=sb.toString();  
            if(str.equals(rev)){  
                dout.writeUTF("Palindrome");
            }else {
                dout.writeUTF("Not palindrome");
            }
         
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}