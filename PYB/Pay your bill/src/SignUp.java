import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SignUp extends JFrame{
	
	public SignUp() {
		
		super("Pay Your Bill");
		
		setLayout(new GridLayout(9, 2));
		
		JLabel FirstName = new JLabel("First Name");
		add(FirstName);
		JTextField nameText = new JTextField();
		add(nameText);
		
		JLabel LastName = new JLabel("Last Name");
		add(LastName);
		JTextField nameText2 = new JTextField();
		add(nameText2);
		
		JLabel Address = new JLabel("Address");
		add(Address);
		JTextField Address1 = new JTextField();
		add(Address1);
		
		JLabel EAddress = new JLabel("E-mail");
		add(EAddress);
		JTextField Address2 = new JTextField();
		add(Address2);
		
		JLabel MN = new JLabel("Mobile no.");
		add(MN);
		JTextField MN1 = new JTextField();
		add(MN1);
		
		JLabel NID = new JLabel("NID no.");
		add(NID);
		JTextField NID1 = new JTextField();
		add(NID1);
		
		JLabel passLabel = new JLabel("Password");
		add(passLabel);
		JPasswordField passField = new JPasswordField();
		add(passField);
		
		JLabel space1 = new JLabel("");
		add(space1);
		JLabel space2 = new JLabel("");
		add(space2);
		
		JCheckBox check = new JCheckBox("I agree to all the terms and conditions of the company");
		add(check);
		
		JButton save = new JButton("Save & Sign up");
		add(save);
		
	}

}
