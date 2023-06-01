package calculator;

import java.awt.event.*;
import java.awt.*;

public class Key5 extends Key{
	
	
	public Key5() {
		super("5");
		setBounds(new Rectangle(64, 107, 44, 30));
		setFont(new Font("Tahoma", 0, 11));
		addActionListener( new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					if ( tfDisplay.getText().length() > 13 )
						return;
					if ( tfDisplay.getText().equalsIgnoreCase("0") ){
						tfDisplay.setText("5");
						return;
					}
					tfDisplay.setText( tfDisplay.getText().concat("5") );
					}
					catch (Exception ex) {
						System.out.println("Can't reach action");
					}
			}
			
		}); 
	}

}