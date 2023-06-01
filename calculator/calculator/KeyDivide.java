package calculator;

import java.awt.event.*;
import java.awt.*;

public class KeyDivide extends Key{
	

	public KeyDivide() {
		super("÷");
		this.setBounds(new Rectangle(163, 73, 44, 30));
		this.setForeground(Color.red);
		this.addActionListener( new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					CalculatorFrame.action = "divide";
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