package calculator;

import java.awt.event.*;
import java.awt.*;

public class Key3 extends Key{
	
	
	public Key3() {
		super("3");
		setBounds(new Rectangle(114, 141, 44, 30));
		setFont(new Font("Tahoma", 0, 11));
		addActionListener( new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					if ( tfDisplay.getText().length() > 13 )
						return;
					if ( tfDisplay.getText().equalsIgnoreCase("0") ){
						tfDisplay.setText("3");
						return;
					}
					tfDisplay.setText( tfDisplay.getText().concat("3") );
					}
					catch (Exception ex) {
						System.out.println("Can't reach action");
					}
			}
			
		}); 
	}

}