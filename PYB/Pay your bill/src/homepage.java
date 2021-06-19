import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class homepage extends JFrame{
	
	public homepage() {
		
		super("Pay Your Bill");
		
		JOptionPane.showMessageDialog(null, "Welcome User!", "Pay Your Bill", JOptionPane.PLAIN_MESSAGE);
		
		setLayout(new GridLayout(5, 2));
		
		JLabel nameLabel = new JLabel("Input user name");
		add(nameLabel);
		JTextField nameText = new JTextField(20);
		add(nameText);
		
		JLabel nameID = new JLabel("Input user ID");
		add(nameID);
		JTextField nameText2 = new JTextField();
		add(nameText2);
		
		JLabel passLabel = new JLabel("Password");
		add(passLabel);
		JPasswordField passField = new JPasswordField();
		add(passField);
		
		JLabel space1 = new JLabel("");
		add(space1);
		JLabel space2 = new JLabel("");
		add(space2);
		
		JButton reset = new JButton("GO!");
		add(reset);
		JButton save = new JButton("Sign up");
		add(save);
		save.addActionListener(new Action());
		
	}
	
	class Action implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			
			JFrame frame2 = new JFrame("Pay Your Bill");
			frame2.setVisible(true);
			frame2.setSize(900, 250);
			
			setLayout(new GridLayout(8, 2));
			
			JLabel FirstName = new JLabel("First Name");
			JTextField nameText = new JTextField(20);
			JPanel First = new JPanel();
			frame2.add(First);
			First.add(FirstName);
			frame2.add(First);
			First.add(nameText);
			
			JLabel LastName = new JLabel("Last Name");
			JTextField nameText2 = new JTextField(20);
			JPanel Last = new JPanel();
			frame2.add(Last);
			Last.add(LastName);
			frame2.add(Last);
			Last.add(nameText);
			
	/**		JLabel FirstName = new JLabel("First Name");
			JTextField nameText = new JTextField(20);
			JPanel First = new JPanel();
			frame2.add(First);
			First.add(FirstName);
			frame2.add(First);
			First.add(nameText);
			
			JLabel FirstName = new JLabel("First Name");
			JTextField nameText = new JTextField(20);
			JPanel First = new JPanel();
			frame2.add(First);
			First.add(FirstName);
			frame2.add(First);
			First.add(nameText);
			
			JLabel FirstName = new JLabel("First Name");
			JTextField nameText = new JTextField(20);
			JPanel First = new JPanel();
			frame2.add(First);
			First.add(FirstName);
			frame2.add(First);
			First.add(nameText);
			
			JLabel FirstName = new JLabel("First Name");
			JTextField nameText = new JTextField(20);
			JPanel First = new JPanel();
			frame2.add(First);
			First.add(FirstName);
			frame2.add(First);
			First.add(nameText);
			
			JLabel FirstName = new JLabel("First Name");
			JTextField nameText = new JTextField(20);
			JPanel First = new JPanel();
			frame2.add(First);
			First.add(FirstName);
			frame2.add(First);
			First.add(nameText);
			
			JLabel FirstName = new JLabel("First Name");
			JTextField nameText = new JTextField(20);
			JPanel First = new JPanel();
			frame2.add(First);
			First.add(FirstName);
			frame2.add(First);
			First.add(nameText);**/
								
		}
		
	}

}
