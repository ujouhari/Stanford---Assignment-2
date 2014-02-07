/*
 * File: FindRange.java
 * Name:Urvashi Jouhari	
 * Section Leader: Bryan Offutt
 * --------------------
 * This program finds the largest and smallest numbers 
 * in a set of integers entered by the user. The end of
 * the set of integers is marked by a SENTINEL value 
 * which is initialized to zero.
 */

import acm.program.*;

public class FindRange extends ConsoleProgram {
	
	private static final int SENTINEL=0; //Initializes the SENTINEL value to zero.
	
	public void run() {
		
		println("This program finds the largest and smallest numbers");
		println("Enter values one per line using "+SENTINEL+" to mark end of sequence.");
		
		int number=0, largest=0, smallest=0, temp=0; //All variables are initially set to zero.
		//int count=0;
		
		while(true){
			number = readInt(" ? "); //Reads integer
			
			/*if (number==SENTINEL && count==0){ //Count variable specifies which number is being entered.
				println("No numbers entered."); // If the first value entered by the user is the SENTINEL value, the console displays message "No numbers entered"
				break;
			}*/
			
			if (number==SENTINEL) { //Once the user enters the SENTINEL value, the largest and smallest numbers are displayed.
				println("The largest number is : " +largest); 
				println("The smallest number is : " +smallest);
				break;
				
			}
			
			//count++;
			
			/*if(count==1){
				largest=number;//If only one value is entered the same value is assigned to both largest and smallest.
				smallest=number;
				}*/
			
			temp=number;
			
			if (number>largest) { //If the new number entered is larger than the one present in the variable 'largest'
				largest=number; 	//It replaces the number in the variable.
			}
			
			if (number<=largest && temp>number) { //If the new number entered is smaller than the one present in the variable 'smallest'
				smallest=number;	//It replaces the number in the variable.
				}
		}
	}
	
}

