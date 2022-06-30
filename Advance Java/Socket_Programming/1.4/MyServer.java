import java.net.*; 
import java.io.*; 
import java.util.Date;
public class MyServer 
{ 
 public static void main(String args[])

 {
try{
 ServerSocket ss=new ServerSocket(3000);
 while(true)
 {
 System.out.println("Waiting For Client Request"); 
 Socket soc=ss.accept();
 DataOutputStream out=new DataOutputStream(soc.getOutputStream());
 out.writeBytes("Server Date" + (new Date()).toString() +"\n");
 out.close();
 soc.close();
 }
 }catch(Exception e) 
    {
        System.out.println(e);
    }
}
}