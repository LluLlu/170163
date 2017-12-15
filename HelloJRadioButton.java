import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class HelloJRadioButton extends JFrame implements ActionListener{
    
    private JLabel label;
    private JRadioButton rbtn1;
    private JRadioButton rbtn2;
    private JRadioButton rbtn3;
    
    
    public void actionPerformed(ActionEvent e) {
     
      Boolean kekka1 = this.rbtn1.isSelected();
      Boolean kekka2 = this.rbtn2.isSelected();
      Boolean kekka3 = this.rbtn3.isSelected();            
      
    
      String msg = "";
      if(kekka1){
        msg = this.rbtn1.getText()+" Select";
        this.label.setText(msg);
      }
      if(kekka2){
        msg = this.rbtn2.getText()+" Select";
        this.label.setText(msg);
      }
      if(kekka3){
        msg = this.rbtn3.getText()+" Select";
        this.label.setText(msg);
      }
    }
    
    HelloJRadioButton(String title) {
     
      setTitle(title);
      setSize(400, 400);
      setLocation(400, 400);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
 
      this.rbtn1 = new JRadioButton("Mac");
      this.rbtn2 = new JRadioButton("Linux");
      this.rbtn3 = new JRadioButton("Windows");   
      
     
      ButtonGroup rBtnGroup = new ButtonGroup();
      rBtnGroup.add(this.rbtn1);         
      rBtnGroup.add(this.rbtn2);         
      rBtnGroup.add(this.rbtn3);               
      

      JButton btn = new JButton("click me");
      btn.addActionListener(this);
      

      this.label = new JLabel("here is a label.");
      

      JPanel panel = new JPanel();
      panel.setLayout(new GridLayout(5, 1));
      panel.add(rbtn1);
      panel.add(rbtn2);
      panel.add(rbtn3);            
      panel.add(btn);
      panel.add(this.label);
      

      Container cp = getContentPane();
      cp.add(panel, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
      HelloJRadioButton frame = new HelloJRadioButton("ALOHA");
      frame.setVisible(true); 
    }
  }