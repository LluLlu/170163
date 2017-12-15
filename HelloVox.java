import javax.swing.JFrame;
   import javax.swing.JPanel;
   import javax.swing.JCheckBox;
   import javax.swing.JButton;
   import javax.swing.JLabel;
   import java.awt.Container;
   import java.awt.BorderLayout;
   import java.awt.GridLayout;
   import java.awt.event.ActionListener;
   import java.awt.event.ActionEvent;
   
   public class HelloVox extends JFrame implements ActionListener{
   	JCheckBox[] check;
   	JLabel[] lbl;
   
   	public static void main(String[] args) {
   		HelloVox frame = new HelloVox("CHECKBOX");
   		frame.setVisible(true);
   	}
   
   	HelloVox(String title){
   		setTitle(title);
   		setSize(400,300);
   		setLocation(400,300);
   		setDefaultCloseOperation(EXIT_ON_CLOSE);
   		//CheckBox		
   		this.check = new JCheckBox[3];
   		this.check[0] = new JCheckBox("JAVA");
   		this.check[1] = new JCheckBox("PYTHON");
   		this.check[2] = new JCheckBox("C/C++");
   		//Label
   		this.lbl = new JLabel[3];
   		this.lbl[0] = new JLabel();
   		this.lbl[1] = new JLabel();
   		this.lbl[2] = new JLabel();
   
   		//Panel
   		JPanel pnl = new JPanel();
   		JPanel msg = new JPanel();
   		pnl.setLayout(new GridLayout(1,3));
   		msg.setLayout(new GridLayout(1,3));
   		for(int i = 0; i<3 ; i++){
   			pnl.add(this.check[i]);
   			msg.add(this.lbl[i]);
   		}
   		//Button 
   		JButton button = new JButton("OK");
   		button.addActionListener(this);
   		JPanel pnlbutton = new JPanel();
   		pnlbutton.add(button);
   
   		Container cont = getContentPane();
   		cont.add(pnl, BorderLayout.NORTH);
   		cont.add(msg, BorderLayout.CENTER);
   		cont.add(pnlbutton, BorderLayout.SOUTH);
   	}
   	//action lister
   	public void actionPerformed(ActionEvent e){
   		System.out.println("CLICK!!");
   		if(this.check[0].isSelected()){
   			this.lbl[0].setText(this.check[0].getText()+"選択");
   		}else {
   			this.lbl[0].setText("");
   		}
   		if(this.check[1].isSelected()){
   			this.lbl[1].setText(this.check[1].getText()+"選択");
   		}else {
   			this.lbl[1].setText("");
   		}
   		if(this.check[2].isSelected()){
   			this.lbl[2].setText(this.check[2].getText()+"選択");
   		}else {
   			this.lbl[2].setText("");
   		}
   	}
   }