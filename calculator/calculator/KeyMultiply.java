package calculator;

import java.awt.event.*;
import java.awt.*;

public class KeyMultiply extends Key{

	public KeyMultiply() {
		super("x");
		this.setBounds(new Rectangle(163, 107, 44, 30));
		this.setForeground(Color.red);
		this.addActionListener( new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					CalculatorFrame.action = "multiply";
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