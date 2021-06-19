import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Support {
	
	Support(){
		
			JFrame frame = new JFrame("Flow Layout");
			
			JButton button,button1, button2, button3;
			
			button = new JButton("1.Account not recharged?");
			button1 = new JButton("2.Meter not working?");
			button2 = new JButton("3.Other");
			button3 = new JButton("4.Back");
			
			frame.add(button);
			frame.add(button1);
			frame.add(button2);
			frame.add(button3);
			
			frame.setLayout(new GridLayout(2,2));
			frame.setSize(300,300);  
			frame.setVisible(true);  
		
		}
	
}	