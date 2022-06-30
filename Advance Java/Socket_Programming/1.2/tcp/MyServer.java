import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.lang.*;

public class MyServer {
    public static void main(String args[])
    {
        try 
        {
            String str;
            // String end="end";
            int i=1;
            Scanner sc = new Scanner(System.in);
            ServerSocket ss = new ServerSocket(1111);
            Socket s = ss.accept();
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            while(true)
            {
                str = (String) din.readUTF();
            
                if(str.equals("end"))
                {
                    System.out.println(i+"]: System: Connection Terminated by Client!\n");
                    System.exit(0);
                }
                else 
                {
                    System.out.println(i+"]: Client Says: "+str);
                    System.out.print(i+"]: Server_Msg : ");
                    str = sc.nextLine();
                    System.out.println();
                    if(str.equals("end"))
                    {
                        i += 1;
                        System.out.println(i+"]: System: Connection Terminated by Server!\n");
                        System.out.println();
                        dout.writeUTF(str);
                        System.exit(0);
                    }
                    else
                    {
                        dout.writeUTF(str);
                    }
                    
                }
                
                i+=1;      
            }


        }catch(Exception e) {
            System.out.println(e);
        }
    }
}