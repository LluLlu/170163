import javax.swing.*;
   import java.awt.*;
   
   public class Fukushu extends JFrame {

     Fukushu(String title) {

       setTitle(title);
       setBounds( 500, 500, 500, 500);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       JMenuBar menubar = new JMenuBar();
       

       JMenu menu = new JMenu("File");
       JMenu menu1 = new JMenu("Edit");
       JMenu menu2 = new JMenu("Help");

       JMenuItem mi1 = new JMenuItem("new");
       JMenuItem mi2 = new JMenuItem("open");
       JMenuItem mi3 = new JMenuItem("close");

       JMenuItem mia = new JMenuItem("cut");
       JMenuItem mib = new JMenuItem("copy");
       JMenuItem mic = new JMenuItem("paste");

       JMenuItem mix = new JMenuItem("version");
       JMenuItem miy = new JMenuItem("iindex");

      JRadioButton rbt1 = new JRadioButton("rororo");
      JRadioButton rbt2 = new JRadioButton("rururu");
      JRadioButton rbt3 = new JRadioButton("rerere");

       JCheckBox c1 = new JCheckBox("katuta");
       JCheckBox c2 = new JCheckBox("kennsuke");
       JCheckBox c3 = new JCheckBox("kebabu");

       JPanel panel = new JPanel();
      // panel.setLayout(new GridLayout(3,1));



       
      
       setJMenuBar(menubar);
       menubar.add(menu);
       menu.add(mi1);
       menu.add(mi2);
       menu.add(mi3);
       menubar.add(menu1);
       menu1.add(mia);
       menu1.add(mib);
       menu1.add(mic);
       menubar.add(menu2);
       menu2.add(mix);
       menu2.add(miy);

       panel.add(c1);
       panel.add(c2);
       panel.add(c3);

       panel.add(rbt1);
       panel.add(rbt2);
       panel.add(rbt3);

       
      Container cp = getContentPane();
      cp.add(panel, BorderLayout.NORTH);

     }

     public static void main(String[] args) {
       Fukushu frame = new Fukushu("ALOHA");
       frame.setVisible(true);
     }
   }