import java.io.*;
import java.net.*;
import java.util.*;
public class Client
{
    public static void main(String[] args) throws Exception
    {
        Scanner a=new Scanner(System.in);
        System.out.print("Enter IP Address And Port Number");
        String k=a.nextLine();
        int j=a.nextInt();
        Socket s=new Socket(k,j);
        BufferedReader kbr=new BufferedReader(new InputStreamReader(System.in));
        InputStream is=s.getInputStream();
        BufferedReader br=new BufferedReader(new InputStreamReader(is));
        OutputStream os=s.getOutputStream();
        PrintStream ps=new PrintStream(os);
        System.out.print("Enter String:");
        String str=kbr.readLine();
        ps.println(str);
        String str2=br.readLine();
        System.out.println("Response From Server="+str2);
        br.close();
        s.close();
    }
}