package calculator;

import java.awt.event.*;
import java.awt.*;

public class Key7 extends Key{
	
	
	public Key7() {
		super("7");
		setBounds(new Rectangle(15, 74, 44, 30));
		setFont(new Font("Tahoma", 0, 11));
		addActionListener( new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					if ( tfDisplay.getText().length() > 13 )
						return;
					if ( tfDisplay.getText().equalsIgnoreCase("0") ){
						tfDisplay.setText("7");
						return;
					}
					tfDisplay.setText( tfDisplay.getText().concat("7") );
					}
					catch (Exception ex) {
						System.out.println("Can't reach action");
					}
			}
			
		}); 
	}

}