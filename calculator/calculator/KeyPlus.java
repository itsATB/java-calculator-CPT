package calculator;

import java.awt.event.*;
import java.awt.*;

public class KeyPlus extends Key{

	public KeyPlus() {
		super("+");
		this.setBounds(new Rectangle(163, 173, 44, 30));
		this.setForeground(Color.red);
		this.addActionListener( new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					CalculatorFrame.action = "plus";
					CalculatorFrame.operand1 = tfDisplay.getText();
					tfDisplay.setText("");
					System.out.println(CalculatorFrame.operand1);
					System.out.println(CalculatorFrame.action);				
					}
				catch (Exception ex) {
						System.out.println("Can't reach action");
				}
			}
		});
	}

}