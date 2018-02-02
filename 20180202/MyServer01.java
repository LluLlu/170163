import  java.io.*;
import  java.net.*;
import  java.util.*;
  
class MyServer01{
  public static void  main(String[] args){

    byte[]  buff  = new byte[1024];
    ServerSocket  servsock  = null;
    Socket  sock;
    
  
     try {
          
      servsock  = new ServerSocket(6000,  300);
      System.out.println("sever");
     
      while(true){
        sock  = servsock.accept();   
        System.out.println("Connecting");

          
          sock.close();
        }
      } catch (IOException  e)  {
        System.exit(1);
      }
  }
}
  
