package calculator;

import java.awt.event.*;
import java.awt.*;

public class Key9 extends Key{
	
	
	public Key9() {
		super("9");
		setBounds(new Rectangle(114, 74, 44, 30));
		setFont(new Font("Tahoma", 0, 11));
		addActionListener( new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					if ( tfDisplay.getText().length() > 13 )
						return;
					if ( tfDisplay.getText().equalsIgnoreCase("0") ){
						tfDisplay.setText("9");
						return;
					}
					tfDisplay.setText( tfDisplay.getText().concat("9") );
					}
					catch (Exception ex) {
						System.out.println("Can't reach action");
					}			
			}
			
		}); 
	}

}