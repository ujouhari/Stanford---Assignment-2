/*
 * File: Hailstone.java
 * Name:Urvashi Jouhari	
 * Section Leader: Bryan Offutt
 * --------------------
 * This program computes the Hailstone Sequence on a number 
 * entered by the user and calculates the number of steps 
 * taken to reach '1'.
 */

import acm.program.*;

public class Hailstone extends ConsoleProgram {
	public void run() {

		computeHailstoneSequence();
		
	}
	
	private void computeHailstoneSequence(){
		
		int n = readInt ("Enter a number :"); //Requests the user to enter a value.
		int counter = 0;					  //Sets a counter to count the number of steps taken to compute the hailstone sequence.
		while(n!=1){
			int x = n % 2;					  //Checks if the value of n is even or odd. 
			if ( x == 0){					  //Since remainder is zero, the number is even and the steps for even number are performed.
				int y = n;
				n=n/2;
				println( +y+ " is even so take half :" +n);
				counter++;				      //Counter is incremented for each step
				
				
			}
			
			else{							  //For all non zero remainders, steps for odd numbers are performed.
				int z = n;
				n=(3*n)+1;
				println( +z+ " is odd so take 3n+1 :" +n);
				counter++;					  //Counter is incremented for each step
			}
		
	}
		println("The number of steps taken to reach 1 are :" +counter); //Displays the number of steps taken by the Hailstone Sequence.
		
		
	}
}

