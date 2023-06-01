package calculator;

import javax.swing.*;

import java.awt.*;

public class CalculatorFrame extends JFrame {
	static JTextField tfDisplay;
	//static Key[][] data = { {new Key0(),new Key1(),new Key4(), new Key7() }, {new KeyClear(),new Key2(),new Key5(),new Key8()}, {new KeyEquals(),new Key3(),new Key6(),new Key9() }, {new KeyPlus(),new KeyMinus(),new KeyMultiply(),new KeyDivide()} };
	static Key0 key0 = new Key0();
	static Key1 key1 = new Key1();
	static Key2 key2 = new Key2();
	static Key3 key3 = new Key3();
	static Key4 key4 = new Key4();
	static Key5 key5 = new Key5();
	static Key6 key6 = new Key6();
	static Key7 key7 = new Key7();
	static Key8 key8 = new Key8();
	static Key9 key9 = new Key9();
	static KeyClear keyClear = new KeyClear();
	static KeyPlus keyPlus = new KeyPlus();
	static KeyMinus keyMinus = new KeyMinus();
	static KeyMultiply keyMultiply = new KeyMultiply();
	static KeyEquals keyEquals = new KeyEquals();
	static KeyDivide keyDivide = new KeyDivide();
	static String operand1;
	static String operand2;
	static double result;
	static String action;
	
	
	
	//Constructor for Calculator's frame and everything inside it
	CalculatorFrame() {
		super("Tim's Calculator");
		sendDisplay();
		setUI(this);
		sendButtons();
	}

	private void sendButtons() {
		System.out.println("sendButtons()");
		//loop to add all "key" button components
		/*for (int i=0; i < data.length; i++) {
			for(int j=0; j < data[i].length; j++) {
				add( data[i][j] );				
			}
		}*/
		
		add( new Key0() );
		add( new Key1() );
		add( new Key2() );
		add( new Key3() );
		add( new Key4() );
		add( new Key5() );
		add( new Key6() );
		add( new Key7() );
		add( new Key8() );
		add( new Key9() );
		add( new KeyClear() );
		add( new KeyEquals() );
		add( new KeyPlus() );
		add( new KeyMinus() );
		add( new KeyMultiply() );
		add( new KeyDivide() );
		
		/*add( key1 );
		add( key2 );
		add( key3 );
		add( key4 );
		add( key5 );
		add( key6 );
		add( key7 );
		add( key8 );
		add( key9 );
		add( keyClear );
		add( keyPlus );
		add( keyMinus );
		add( keyDivide );
		add( keyMultiply );
		add( keyEquals );*/
		System.out.println("sendButtons()");
	
	}

	//method to set properties of frame
	private void setUI(CalculatorFrame app) {
		System.out.println("sendUI()");
		app.setTitle("Tim's Calculator");
		app.setSize(250,250);		
		app.setResizable(false);
		app.setLayout(null);
		app.setLocationRelativeTo(null);
		app.setVisible(true);
		app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//creates "screen" for calculator numbers
	private void sendDisplay() {
		System.out.println("sendDisplay()");
		tfDisplay = new JTextField("0");
		System.out.println("sendDisplay()");
		this.tfDisplay.setHorizontalAlignment(JTextField.RIGHT);
	    this.tfDisplay.setBounds(new Rectangle(14, 36, 194, 28));
	    tfDisplay.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
	    this.tfDisplay.setFont(new Font("Tahoma", 0, 11));
	    tfDisplay.setEditable(false);
		add(tfDisplay);
	}

}
