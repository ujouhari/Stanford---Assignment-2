/*
 * File: PythagoreanTheorem.java
 * Name:Urvashi	Jouhari	
 * Section Leader:Bryan Offutt
 * -----------------------------
 * This program computes the Pythagorean Theorem on two values entered by the user.
 */

import acm.program.*;

public class PythagoreanTheorem extends ConsoleProgram {
	public void run() {
		
		println("Enter values to compute Pythagorean Theorem");
		computePythagorean();	
		
	}
	
	private void computePythagorean(){
		
		double a = readDouble ("Enter a:"); //Requests the user to enter the value for 'a'
		double b = readDouble ("Enter b:"); //Requests the user to enter the value for 'b'
		double c = Math.sqrt((a*a) + (b*b));//Computes 'c' based on the Pythagorean theorem
	
		println("c=" + c); 					//Displays the computed value of 'c'
		
	}
}
