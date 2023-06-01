package calculator;

import java.awt.event.*;
import java.awt.*;


public class Key0 extends Key{
	
	
	public Key0() {
		super("0");
		setBounds(new Rectangle(15, 175, 45, 30));
		setFont(new Font("Tahoma", 0, 11));
		addActionListener( new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					if ( tfDisplay.getText().length() > 13 )
						return;
					if ( tfDisplay.getText().equalsIgnoreCase("0") ){
						tfDisplay.setText("0");
						return;
					}
					tfDisplay.setText( tfDisplay.getText().concat("0") );
					}
					catch (Exception ex) {
						System.out.println("Can't reach action");
					}
			}
			
		}); 
	}

}