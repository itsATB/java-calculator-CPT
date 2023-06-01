package calculator;

import java.awt.event.*;
import java.awt.*;

public class Key4 extends Key{
	
	
	public Key4() {
		super("4");
		setBounds(new Rectangle(14, 108, 45, 30));
		setFont(new Font("Tahoma", 0, 11));
		addActionListener( new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					if ( tfDisplay.getText().length() > 13 )
						return;
					if ( tfDisplay.getText().equalsIgnoreCase("0") ){
						tfDisplay.setText("4");
						return;
					}
					tfDisplay.setText( tfDisplay.getText().concat("4") );
					}
					catch (Exception ex) {
						System.out.println("Can't reach action");
					}
			}
			
		}); 
	}

}