package login;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Choose extends JFrame {
	int setSize; 
	JLabel jlb;
    JComboBox<String> combo_sub;
    JButton but_sub;

     public Choose() {
         setDefaultCloseOperation(EXIT_ON_CLOSE);
            setSize(500,500);
            setTitle("Form");
            setLayout(null);
            jlb = new JLabel("Choose Your Module");
            jlb.setBounds(50, 100, 120, 20);
            add(jlb);

            combo_sub=new JComboBox<String>();
            combo_sub.setBounds(180, 100, 100, 30);
            combo_sub.addItem("HTML");
            combo_sub.addItem("Communication");
            combo_sub.addItem("Ethics");
            add(combo_sub);

            but_sub = new JButton("Submit");
            but_sub.setBounds(140, 190, 90, 30);
            add(but_sub);

            setVisible(true);

     }
}
