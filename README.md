# Java-calculator-CPT
A calculator desktop application created in Java. With full functionality of any calculator used for basic maths.

<img style="width:20%" src="https://github.com/itsATB/java-calculator-CPT/blob/main/demo/Screenshot%202023-06-01%20155801.png"/>
</br>


<p4> Eg. Basic Multiplication </p4>

<p>
  <a> <img style="width:20%" src="https://github.com/itsATB/java-calculator-CPT/blob/main/demo/Screenshot%202023-06-01%20160002.png"/> </a>
  <a> <img style="width:19%" src="https://github.com/itsATB/java-calculator-CPT/blob/main/demo/Screenshot%202023-06-01%20160051.png"/> </a>
</p>
<br/>


## Under the Hood 

<p> This program uses the java swing package for carrying out and displaying all GUI-related functions. </P>

<p> 
  <img style="width:40%" src="https://github.com/itsATB/java-calculator-CPT/blob/main/demo/Screenshot%202023-06-01%20161359.png"/> <br>
  The parent lass for keys are extended from JButtons provided in the swing class 
</p>

<p> 
  <img style="width:40%" src="https://github.com/itsATB/java-calculator-CPT/blob/main/demo/Screenshot%202023-06-01%20161546.png"/> <br>
  All the calculator keys then extend the parent class, constructed with their corresponding display icon.
</p>

<p> 
  <img style="width:40%" src="https://github.com/itsATB/java-calculator-CPT/blob/main/demo/Screenshot%202023-06-01%2016234002.png"/> <br>
  All the calculator keys are then added to the display in the CalculatorFrame Class
</p>
<br>

<p> 
  For the keys corresponding to math operations, when the key is pressed the number shown in the display is stored, as well as the actions corresponding to what action that key carries out. The button clicks are registered via an actionListener
</p>

<p>
  When the equas key is pressed, the operation and operands from the display are stored and given to a specific function that carried out the operation on the given operands, showing the result to the display. <br>
  <img style="width:40%" src="https://github.com/itsATB/java-calculator-CPT/blob/main/demo/Screenshot%202023-06-01%20161723.png"/> 
  <img style="width:40%" src="https://github.com/itsATB/java-calculator-CPT/blob/main/demo/Screenshot%202023-06-01%20161546.png"/> 
</p>

<p> 
  As an extra feature for aestheitcs, the look of the buttons and display is adjusted to match the operating system that the calculator is running on. <br>
  <img style="width:40%" src="https://github.com/itsATB/java-calculator-CPT/blob/main/demo/Screenshot%202023-06-01%20161546.png"/> 
</p>
<br>

## Usage
To run this program simply download the executable .jar file included. (Must have the Java Environment installed)
