package calculator;

import java.awt.event.*;
import java.awt.*;

public class KeyClear extends Key{

	public KeyClear() {
		super("C");
		this.setBounds(new Rectangle(64, 175, 44, 30));
		this.setForeground(Color.red);
		this.addActionListener( new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {				
				try {
					tfDisplay.setText("0");
					}
				catch (Exception ex) {
						System.out.println("Can't reach action");
					}
			}
		});
	}

}