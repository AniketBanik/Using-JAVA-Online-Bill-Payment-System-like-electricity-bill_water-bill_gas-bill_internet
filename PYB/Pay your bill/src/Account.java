import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Account extends JFrame {
	
	public Account() {
		
		super("Pay Your bill");
		
		setLayout(new GridLayout(7,2));
		
		JLabel nameLabel= new JLabel("USER ID");
		add(nameLabel);		
		JLabel nameLabel1=new JLabel("1612719042");
		add(nameLabel1);
		
		
		JLabel obj=new JLabel("USER NAME");
		add(obj);
		JLabel obj1=new JLabel("ANIKET BANIK");
		add(obj1);
		
		JLabel obj2=new JLabel("ADDRESS");
		add(obj2);
		JLabel objo = new JLabel("HALOGJUGE");
		add(objo);
		
		JLabel obj3=new JLabel("NUMBER OF UNITS");
		add(obj3);
		JLabel obj4=new JLabel("4");
		add(obj4);
		
		JLabel obj5=new JLabel("MOBILE NUMBER");
		add(obj5);
		JLabel obj6=new JLabel("01521324678");
		add(obj6);
		
		JLabel space2 = new JLabel("");
		add(space2);
		JLabel space3 = new JLabel("");
		add(space3);
		
		JButton back = new JButton("BACK");
		add(back);
		
	}

}