package calculator;

import javax.swing.*;

import  java.awt.*;

public class Key extends JButton {
	private String text;
	JTextField tfDisplay = CalculatorFrame.tfDisplay;
	String operand1 = CalculatorFrame.operand1;
	String operand2 = CalculatorFrame.operand2;
	static String action = CalculatorFrame.action;
	double result = CalculatorFrame.result;
	
	
	public Key(String text) {
		this.setText(text);
		this.setVisible(true);
	}
	
	

}
