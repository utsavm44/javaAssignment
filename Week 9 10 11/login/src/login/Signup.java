package login;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Signup extends JFrame implements ActionListener{
	

JButton jbSignUp; //jbReset; // button
JLabel jblFirst, jblLast, jblName, jblPassword, jblEmail; // label
JTextField jtxtfirst, jtxtlast, jtxtName,  jtxtEmail; // text field 
JPasswordField Password, configpass; //password field


    public Signup()
{
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setSize(500,500);
    setTitle("Form1");
    Container c = getContentPane();
    c.setLayout(null);

    // name section
    
    jblFirst = new JLabel("First name");
    jblFirst.setBounds(10, 10, 120, 30);	
    
    jtxtName = new JTextField();
    jtxtName.setBounds(115, 10, 120, 30);
    
    jblLast = new JLabel("Last name");
    jblLast.setBounds(10, 50, 120, 30);	
    
    jtxtlast = new JTextField();
    jtxtlast.setBounds(115, 50, 120, 30);
    c.add(jtxtlast);


 // email section
    jblEmail = new JLabel("Email");
    jblEmail.setBounds(10, 90, 120, 30);
    
    jtxtEmail = new JTextField();
    jtxtEmail.setBounds(115, 90, 120, 30);
    
    // password section
    jblPassword = new JLabel("Password");
    jblPassword.setBounds(10, 130, 120, 30);	
    
    Password = new JPasswordField();
    Password.setBounds(115, 130, 120, 30);	

    
    // sign up section
     jbSignUp = new JButton("Sign Up");
    jbSignUp.setBounds(100, 170,  100,30);
   c.add(jblFirst);c.add(jblLast);c.add(jtxtName);c.add(jbSignUp);
    c.add(jblPassword);c.add(jblPassword);
    c.add(jblEmail);c.add(jtxtEmail);
    c.add(Password); c.add(Password);
    setVisible(true);
    
    jbSignUp.addActionListener(this);{
    	
    }
    
}


	@Override
	public void actionPerformed(ActionEvent e) {
		//database
				if(e.getSource()==(jbSignUp))
		        {
		            try {
		                database db=new database();
		                int result=db.signup(0,jtxtName.getText(),jtxtlast.getText(),jtxtEmail.getText(),Password.getText());
		                if(result>0)
		                {
		                    JOptionPane.showMessageDialog(null,"Saved");
		                    
		                }
		            
		                else
		                {
		                    JOptionPane.showMessageDialog(null,"Unable to saved");
		                }
		            }
		            catch (Exception ae) {
		            }
		        }
		
		
	}

}
