package calculator;

import java.awt.event.*;
import java.awt.*;

public class KeyEquals extends Key{

	public KeyEquals() {
		super("=");
		this.setBounds(new Rectangle(114, 174, 44, 30));
		this.setForeground(Color.blue);
		this.addActionListener( new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				//try {
					CalculatorFrame.operand2 = tfDisplay.getText();
					System.out.println("action: "+action);	
					System.out.println("num 2: "+CalculatorFrame.operand2);
					System.out.println("EQUALS:");
					if( CalculatorFrame.action.equals("plus") ){
						double digit1 = Integer.parseInt(CalculatorFrame.operand1);
						double digit2 = Integer.parseInt(CalculatorFrame.operand2);
						result = Math.round((((digit1 + digit2)*100000)/100000));
						tfDisplay.setText( new Double(result).toString() );
						//tfDisplay.setText( new Integer((int)result).toString() );
						System.out.println(result);
					}
					else if( CalculatorFrame.action.equals("minus") ){
						double digit1 = Integer.parseInt(CalculatorFrame.operand1);
						double digit2 = Integer.parseInt(CalculatorFrame.operand2);
						result = Math.round((((digit1 - digit2)*100000)/100000));
						tfDisplay.setText( new Double(result).toString() );
						//tfDisplay.setText( new Integer((int)result).toString() );
						System.out.println(result);
					}
					else if( CalculatorFrame.action.equals("multiply") ){
						double digit1 = Integer.parseInt(CalculatorFrame.operand1);
						double digit2 = Integer.parseInt(CalculatorFrame.operand2);
						result = Math.round((((digit1 * digit2)*100000)/100000));
						tfDisplay.setText( new Double(result).toString() );
						//tfDisplay.setText( new Integer((int)result).toString() );
						System.out.println(result);
					}
					else if( CalculatorFrame.action.equals("divide") ){
						double digit1 = Integer.parseInt(CalculatorFrame.operand1);
						double digit2 = Integer.parseInt(CalculatorFrame.operand2);
						result = Math.round((((digit1 / digit2)*100000)/100000));
						tfDisplay.setText( new Double(result).toString() );
						//tfDisplay.setText( new Integer((int)result).toString() );
						System.out.println(result);
					}
				//}
				//catch(Exception ex) {
				//	System.out.println("Can't reach action");
				//}
			}
		});
	}

}