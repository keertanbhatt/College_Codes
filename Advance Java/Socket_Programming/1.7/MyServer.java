import java.io.*;
import java.net.*;
class MyServer
{
            public static void main(String args[]) 
            {
                try {
                    
                
                        ServerSocket ss=new ServerSocket(7777);
                        Socket s=ss.accept();
                        System.out.println("connected..........");
                        FileInputStream fin=new FileInputStream("prac1-7.txt");
                        DataOutputStream dout=new DataOutputStream(s.getOutputStream());
                        int r;
                        while((r=fin.read())!=-1)
                        {
                                    dout.write(r);
                                   
                        }
                        System.out.println("\nFiletranfer Completed");
                        s.close();
                        ss.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
            }
}