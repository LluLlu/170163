import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Fukushu extends JFrame implements ActionListener{
    JCheckBox cb;
    JLabel lb;
    JButton bt;

    public static void main(String[] args){
      Fukushu frame = new Fukushu("Fukushu");

       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
  }

   Fukushu(String title){
   	setTitle(title);
   	setBounds(500,500,500,500);

    lb = new JLabel("");
    lb.setHorizontalAlignment(JLabel.CENTER); 
    
    cb = new JCheckBox("1");
   

    bt = new JButton("OK");
    bt.addActionListener(this);
   // bt.setActionCommand("okbtn");   

    JPanel pnl = new JPanel();
    pnl.add(cb);
    pnl.add(bt);

    getContentPane().add(pnl, BorderLayout.CENTER);
    getContentPane().add(lb, BorderLayout.PAGE_END);

   }
   public void actionPerformed(ActionEvent e){
   	System.out.println("CLICK!!");
    if(this.cb.isSelected()){
    	this.lb.setText(this.cb.getText()+" Select");
    }else{
    	this.lb.setText("No Select");
    }



   //String cmd = e.getActionCommand();
   //	if(cmd.equals("111")){
   	//	lb.setText("!1!");
   //	}

   }

}