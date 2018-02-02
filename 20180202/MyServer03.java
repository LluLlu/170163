import  java.io.*;
import  java.net.*;
import  java.util.*;
  
class MyServer03{
  public static void  main(String[] args){

    byte[]  buff  = new byte[1024];
    ServerSocket  servsock  = null;
    Socket  sock;
    InputStream in; 
    boolean cont  = true;
    
  
     try {
          
      servsock  = new ServerSocket(5999,  300);
      System.out.println("sever");
     
      while(true){
        sock  = servsock.accept();   
        System.out.println("Connecting");
        in = sock.getInputStream();
        int n = in.read(buff);
        System.out.write(buff,0,n);

          
          sock.close();
        }
      } catch (IOException  e)  {
        System.exit(1);
      }
  }
}
  