import java.io.*;
import java.util.*;
import java.net.*;

public class Server {

    public static void main(String args[]) {
        try {
            ServerSocket ss = new ServerSocket(1111);
            Socket s = new Socket();
            s = ss.accept();

            System.out.println("Connected!");

            OutputStream os = s.getOutputStream();
            PrintStream ps = new PrintStream(os);
            InputStream is = s.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String str = br.readLine();
            String str2 = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                char c = str.charAt(i);
                if (Character.isUpperCase(c)) {
                    str2 = str2 + Character.toUpperCase(c);
                } else if (Character.isLowerCase(c)) {
                    str2 = str2 + Character.toLowerCase(c);
                }
                else{
                    str2=str2+c;
                }
            }
            ps.println(str2);
            ps.close();
            ss.close();
            s.close();
            
        }catch (Exception e) {
            System.out.println(e);
        }

    }
}
