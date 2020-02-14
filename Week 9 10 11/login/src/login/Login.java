package login;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Login extends JFrame implements ActionListener {
	JButton jbLogin; // button
	JLabel jblEmail, jblPassword; // label
	JTextField jtxtEmail, jtxtPassword ;
	JButton jbsignup;
	
	public Login()
	{
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	    setSize(500,500);
	    setTitle("Form2");
	    Container c = getContentPane();
	    c.setLayout(null);
	    
	    // email section
	    jblEmail = new JLabel("Email");
	    jblEmail.setBounds(10, 50, 120, 30);
	    
	    jtxtEmail = new JTextField();
	    jtxtEmail.setBounds(115, 90, 120, 30);
	    
	    // password section
	    jblPassword = new JLabel("Password");
	    jblPassword.setBounds(10, 90, 120, 30);
	    jtxtPassword = new JTextField();
	    jtxtPassword.setBounds(115, 50, 120, 30);
 
	    // Login section
	     jbLogin = new JButton("Log in");
	    jbLogin.setBounds(100, 130,  100,30);
	    c.add(jbLogin);
	    c.add(jblEmail);c.add(jtxtEmail);
	    c.add(jblPassword);c.add(jtxtPassword);
	   
	    
	    // Sign up Section
	    jbsignup = new JButton("Register");
	    jbsignup.setBounds(210, 130, 120, 30);
	    c.add(jbsignup);
	    jbsignup.addActionListener(this);
	    jbLogin.addActionListener(this);
	}
	public static void main (String[] args)
    {
        new Login().setVisible(true); 
    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource().equals(jbsignup))
		{
			new Signup();
		}
		if(e.getSource().equals(jbLogin))
		{
			new Choose();
		}
		
		
	}
}

