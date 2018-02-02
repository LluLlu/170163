import  java.io.*;
import  java.net.*;
import  java.util.*;
  
class MyServer05 {
  public static void  main(String[] args){

    byte[]  buff  = new byte[1024];
    ServerSocket  servsock  = null;
    Socket  sock;
    OutputStream  out;
    InputStream in;           
    String  outstr;
    boolean cont  = true;
    int  i;
    Date  d;
  
     try {
          
      servsock  = new ServerSocket(4000,  300);
      System.out.println("server");
     
      while(true){
        sock  = servsock.accept();   
        System.out.println("Connecting");
        System.out.println(sock);
        in = sock.getInputStream();
        int n = in.read(buff);
        System.out.write(buff,0,n);

        d = new Date();
       outstr =  "\n"  + d.toString()  + "\n"
                 +"rururu"+"\n";

         out = sock.getOutputStream();
         
         out.write(outstr.getBytes());
         
         out.write('\n');
         sock.close();
        }
      } catch (IOException  e)  {
        System.exit(1);
      }
  }
}
  