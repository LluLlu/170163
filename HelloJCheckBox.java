import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class HelloJCheckBox extends JFrame implements ActionListener{
 JLabel label;

  public static void main(String[] args){
    HelloJCheckBox frame = new HelloJCheckBox("Hello!");

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }

  HelloJCheckBox(String title){
    setTitle(title);
    setBounds( 500, 500, 500, 500);

    label = new JLabel("");
    label.setHorizontalAlignment(JLabel.CENTER);

    JCheckBox c1 = new JCheckBox("katuta");
    c1.addActionListener(this);
    c1.setActionCommand("Button 1");
    JCheckBox c2 = new JCheckBox("kennsuke");
    c2.addActionListener(this);
    c2.setActionCommand("Button 1");
    JCheckBox c3 = new JCheckBox("kebabu");
    c3.addActionListener(this);
    c3.setActionCommand("Button 1");

    JButton okb = new JButton("OK");
      okb.addActionListener(this);
      okb.setActionCommand("okbtn");

   

    JPanel panel = new JPanel();
    panel.add(c1);
    panel.add(c2);
    panel.add(c3);
    panel.add(okb);




    getContentPane().add(panel, BorderLayout.CENTER);
    getContentPane().add(label, BorderLayout.PAGE_END);
  }

  public void actionPerformed(ActionEvent e){
    System.out.println("CLICK!!");
    String cmd = e.getActionCommand();

    if (cmd.equals("Button 1")){
      label.setText("Click1");
    }else if (cmd.equals("Button 2")){
      label.setText("Click2");
    }else if (cmd.equals("Button 3")){
      label.setText("Click3");
    }
  }
}