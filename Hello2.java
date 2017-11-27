import javax.swing.*;
import java.awt.Container;
import java.awt.BorderLayout;

public class Hello2 extends JFrame{
	Hello2(String title){
		setTitle(title);
		setSize(400,400);
		setLocation(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btn = new JButton("Hello");

        JPanel panel = new JPanel();
        panel.add(btn);

        Container cp = getContentPane();
        cp.add(panel,BorderLayout.CENTER);
	}
	public static void main(String[] args){
	  Hello hello = new Hello("ALOHA");
		hello.setVisible(true);
	}
}