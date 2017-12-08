import javax.swing.*;
import java.awt.*;
public class TestCheckBox extends JFrame{
	TestCheckBox(String title){
      setTitle(title);
	  setLocation(500,500);
	  setSize(500,500);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	  JPanel panel = new JPanel();

	  JCheckBox c1 = new JCheckBox("111111");
	  JCheckBox c2 = new JCheckBox("222222");
	  JCheckBox c3 = new JCheckBox("333333");

	  panel.add(c1);
	  panel.add(c2);
	  panel.add(c3);

	  Container cp = getContentPane();
   		cp.add(panel,BorderLayout.NORTH);
	  
	}
	public static void main(String[] args){
		TestCheckBox frame = new TestCheckBox("Hello!");
    	frame.setVisible(true);
	}
}