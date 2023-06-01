package calculator;

import java.awt.event.*;
import java.awt.*;

public class Key6 extends Key{
	
	
	public Key6() {
		super("6");
		setBounds(new Rectangle(114, 107, 44, 30));
		setFont(new Font("Tahoma", 0, 11));
		addActionListener( new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					if ( tfDisplay.getText().length() > 13 )
						return;
					if ( tfDisplay.getText().equalsIgnoreCase("0") ){
						tfDisplay.setText("6");
						return;
					}
					tfDisplay.setText( tfDisplay.getText().concat("6") );
					}
					catch (Exception ex) {
						System.out.println("Can't reach action");
					}
			}
			
		}); 
	}

}