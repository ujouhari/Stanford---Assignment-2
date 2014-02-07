/*
 * File: Target.java
 * Name:
 * Section Leader:
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {
	private static final double outerradius=1.00*72; //outer circle radius is defined in terms of pixels.
	private static final double middleradius=0.65*72; //middle circle radius is defined in terms of pixels.
	private static final double innerradius=0.30*72; // inner circle radius is defined in terms of pixels.
	

	public void run() {
		
		drawOuterCircle();
		drawMiddleCircle();
		drawInnerCircle();	
	}
	
	private void drawOuterCircle(){
		
		int x = getWidth()/2; 
		int y = getHeight()/2; //Finds the mid-point of the graphics window
		
		 x = x- (int)outerradius;
		 y = y -(int)outerradius;//Start point of the outer circle.
		
		GOval OuterCircle= new GOval (x,y, outerradius*2,outerradius*2); //width and height of the oval are same as the diameter of the circle.
		OuterCircle.setColor(Color.RED); //Border color is set to red.
		OuterCircle.setFilled (true);//The circle will be filled.
		OuterCircle.setFillColor(Color.RED);//The fill color is set to red.
		add (OuterCircle);//Outer circle is added to the canvas.
		
	}
	private void drawMiddleCircle(){
		
		int x = getWidth()/2;
		int y = getHeight()/2;//Finds the mid-point of the graphics window
		
		 x = x - (int)middleradius;
		 y = y - (int)middleradius;//Start point of the middle circle.
		
		GOval MiddleCircle= new GOval (x,y, middleradius*2,middleradius*2);//width and height of the oval are same as the diameter of the circle.
		MiddleCircle.setColor(Color.WHITE);//Border color is set to red.
		MiddleCircle.setFilled (true);//The circle will be filled.
		MiddleCircle.setFillColor(Color.WHITE);//The fill color is set to white.
		add (MiddleCircle);//Middle circle is added to the canvas.
	}
	
private void drawInnerCircle(){
	
		int x = getWidth()/2;
		int y = getHeight()/2;
		
		 x = x- (int)innerradius;
		 y = y -(int)innerradius;//Start point of the inner circle.
		
		GOval InnerCircle= new GOval (x,y, innerradius*2,innerradius*2);
		InnerCircle.setColor(Color.RED);//Border color is set to red.
		InnerCircle.setFilled (true);//The circle will be filled.
		InnerCircle.setFillColor(Color.RED);//The fill color is set to red.
		add (InnerCircle);//Inner circle is added to the canvas.
	}

}
