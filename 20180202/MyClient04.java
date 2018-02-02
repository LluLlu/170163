  import java.io.*;
  import java.net.*;
  
  public class MyClient04{
    public static void main(String[] args){
      byte[]  buff  = new byte[1024];   
      Socket  sock;
      OutputStream ous = null;  
  

      try {
        sock  = new Socket(args[0], Integer.parseInt(args[1]));
        ous = sock.getOutputStream();
        
        String msg = "170163"+"\n"
                    +"LluLlu"+"\n"
                    +"OMG";


        ous.write(msg.getBytes());
        ous.write(buff);

        sock.close();

     }catch(Exception e){
      System.out.println("miss");
     }
   }
}