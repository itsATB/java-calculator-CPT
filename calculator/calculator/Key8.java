package calculator;

import java.awt.event.*;
import java.awt.*;

public class Key8 extends Key{
	
	
	public Key8() {
		super("8");
		setBounds(new Rectangle(64, 73, 44, 30));
		setFont(new Font("Tahoma", 0, 11));
		addActionListener( new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					if ( tfDisplay.getText().length() > 13 )
						return;
					if ( tfDisplay.getText().equalsIgnoreCase("0") ){
						tfDisplay.setText("8");
						return;
					}
					tfDisplay.setText( tfDisplay.getText().concat("8") );
					}
					catch (Exception ex) {
						System.out.println("Can't reach action");
					}
			}
			
		}); 
	}

}