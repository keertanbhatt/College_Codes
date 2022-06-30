//MyServer
import java.io.*;
import java.util.*;
import java.net.*;
import java.lang.*;

public class MyServer {
    public static void main(String args[]) {
        try {
            
            ServerSocket ss = new ServerSocket(1111);
            Socket s = ss.accept();

            DataInputStream din = new DataInputStream(s.getInputStream());
            String str = (String) din.readUTF();

            System.out.println("Client Says :"+str);
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }    
}
