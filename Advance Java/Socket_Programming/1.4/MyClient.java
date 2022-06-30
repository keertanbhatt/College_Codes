import java.io.*;
import java.net.*;
import java.util.*;
public class MyClient
{
public static void main(String args[]) 

{
try{
Socket s=new Socket("localhost",3000);
BufferedReader br=new BufferedReader(new InputStreamReader(s.getInputStream()));
System.out.println(br.readLine());
}catch(Exception e) 
{
    System.out.println(e);
}
}
}