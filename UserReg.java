import javax.swing.*;
//Frame TexitField passwordfield panellabel awt BoderLayout Container 
import java.awt.*;

public class UserReg extends JFrame{
	UserReg(String title){
	  setTitle(title);
	  setLocation(500,500);
	  setSize(500,500);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	  JLabel maillb = new JLabel("mail");
	  JLabel pwd = new JLabel("password");

	  JPasswordField pfd = new JPasswordField("ALOHA",10);
	  JTextField mailfl = new JTextField("",10);

	  JPanel panel = new JPanel();
      panel.add(maillb);
      panel.add(mailfl);
      panel.add(pwd);
      panel.add(pfd);



      Container cp = getContentPane();
   		cp.add(panel,BorderLayout.NORTH);
   	}


	public static void main(String[] args){
        UserReg frame = new UserReg("Hello!");
    	frame.setVisible(true);

	}
} 