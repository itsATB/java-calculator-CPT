package calculator;

import javax.swing.*;

public class Calculator {

	public static void main(String[] args) {
		//Change UI to look like the operating systeam's theme	
		SwingUtilities.invokeLater(new Runnable()
	    {
	      public void run()
	      {
	    	  try {
	  			UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName() );
	  			JFrame.setDefaultLookAndFeelDecorated(true);
	  		}
	  		catch(Exception e) {
	  			System.out.println("Could not load system look");
	  		}	  		
	        new Calculator();
	      }
	    });
	}
	
	public Calculator() {
		CalculatorFrame frame = new CalculatorFrame();
	}

}//done
