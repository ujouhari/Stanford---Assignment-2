/*
 * File: Pyramid.java
 * Name:
 * Section Leader:
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Pyramid extends GraphicsProgram {

	/** Width of each brick in pixels */
	private static final int BRICK_WIDTH = 30;

	/** Width of each brick in pixels */
	private static final int BRICK_HEIGHT = 12;

	/** Number of bricks in the base of the pyramid */
	private static final int BRICKS_IN_BASE = 14;
	
	int counter=0; 
	
	public void run() {
		
		while (counter < BRICKS_IN_BASE){
			
		/**Since the number of bricks in a row decrease by one as we move up by one
		 * the number of bricks in a row is found by subtracting the bricks in the base 
		 * with the value of the counter, where the counter holds the row number. */	
		int number_of_bricks_in_row = BRICKS_IN_BASE - counter;
		
		/**The total width of each row would be the width of each brick multiplied 
		 * by the number of bricks in that row  */
		int total_width_of_row = BRICK_WIDTH * number_of_bricks_in_row;
		
		
		/**The position of the 'x' coordinate of the first brick in the row can be 
		 * determined by subtracting the midpoint of the width of the display window 
		 * by half of the total width of the row. */
		double x=(getWidth()- total_width_of_row )/2;
		
		/**The position of the 'y' coordinate of the first brick of the row can be
		 * determined by subtracting the height of the display window by the height 
		 * at which the row is present. Since all the bricks have a standard height,
		 * this height can be determined by multiplying the height of the brick with the 
		 * row number. The row number in this case would be the value of the counter 
		 * incremented by one */
		double y=getHeight()-(BRICK_HEIGHT * (counter+1));
		
		/**The counter is incremented so the operations can be performed for the next row. */
		counter++;
		
		
		for(int i=0;i<number_of_bricks_in_row; i++){
			GRect brick = new GRect (x,y,BRICK_WIDTH,BRICK_HEIGHT);
			add(brick);
			x=x+BRICK_WIDTH;// The 'x'-coordinate changes for every brick.
		}
		y=y+BRICK_HEIGHT;// The 'y'-coordinate changes for every row.
		
		}
		
	}
}
