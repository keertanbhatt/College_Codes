//MyClient
import java.io.*;
import java.net.*;
import java.util.*;
import java.lang.*;

public class MyClient {
    public static void main(String args[]) {
        try {
            
            Socket s = new Socket("localhost",1111);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            
            Scanner sc = new Scanner(System.in);
            System.out.print("Client Message :");
            String str = sc.nextLine(); 
            
            dout.writeUTF(str);

        }catch(Exception e) {
            System.out.println(e);
        }
    }    
}
