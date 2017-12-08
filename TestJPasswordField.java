import javax.swing.*;
import java.awt.*;

public class TestJPasswordField extends JFrame{
   TestJPasswordField(String title){
	  setTitle(title);
	  setLocation(500,500);
	  setSize(500,500);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
      JTextField fd = new JTextField("",20);
      JPasswordField pfd = new JPasswordField("ALOHA",10);

      JPanel panel = new JPanel();


      panel.add(fd,BorderLayout.NORTH);
      panel.add(pfd,BorderLayout.NORTH);

      Container cp = getContentPane();
   		cp.add(panel,BorderLayout.NORTH);
   	}


    public static void main(String[] args){
    	TestJPasswordField frame = new TestJPasswordField("Hello!");
    	frame.setVisible(true);

    }
	
}