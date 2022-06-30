import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.lang.*;

public class MyClient {
    public static void main(String args[])
    {
        try {

            String str;
            // String end = "end";
            int i=1;
            Scanner sc = new Scanner(System.in);
            Socket s = new Socket("2405:201:200a:50a0:44e2:1eb4:41c0:7ff9",1111);
            DataInputStream din = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());

            System.out.println();
            while(true)
            {
                System.out.print(i+"]: Client_Msg : ");
                str = sc.nextLine();

                if(str.equals("end"))
                {
                    System.out.println(i+"]: System: Connection Terminated by Client!\n");
                    dout.writeUTF(str);
                    System.exit(0);
                }
                else
                {
                    dout.writeUTF(str);
                    str = (String)din.readUTF();
                    if(str.equals("end"))
                    {
                        System.out.println(i+"]: System: Connection Terminated by Server!\n");
                        System.exit(0);
                    }
                    else {
                        System.out.println(i+"]: Server says: "+str);
                        System.out.println();
                    }
                    
                }
                 i=i+1;
            }
            
        }catch(Exception e) {
            System.out.println(e);
        }
    }
}
