/*
 * File: ProgramHierarchy.java
 * Name:
 * Section Leader:
 * ---------------------------
 * This file is the starter file for the ProgramHierarchy problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class ProgramHierarchy extends GraphicsProgram {	
	int box_width=120; //set width of the box
	int box_height=60; //set height of the box
	int line_length=50;//set the length of the line.
	int distance_between_boxes=80;//sets the distance between two boxes.
	
	public void run() {
		
		drawBoxProgram();
		
		lineToGraphicsProgram();
		drawBoxGraphicsProgram();
		
		lineToConsoleProgram();
		drawBoxConsoleProgram();
		
		lineToDialogProgram();
		drawBoxDialogProgram();
		
	}
	
	private void drawBoxProgram(){
		
		/**x and y coordinates to place the 'Program' 
		 * box in the center of the graphics window.*/
		int x=getWidth()/2 - box_width/2;
		int y=getHeight()/2 - box_height/2;
		
		GRect Box1 = new GRect (x,y,box_width,box_height);
		add(Box1);
		
		/**Creates a new label 'Program' but places it on top of the box.*/
		GLabel Program = new GLabel ("Program",x,y); 
		add(Program);
		
		/**Calculates the actual location of the 'Program' label*/
		double label_height = box_height/2 + Program.getAscent()/2;
		double label_width = box_width/2 - Program.getWidth()/2;
		
		Program.move(label_width, label_height);//Moves the Program label to the center of the box.
	}
	
	private void lineToGraphicsProgram(){
		
		/**The first x-coordinate 'x1' is the midpoint of the box which is
		 * the same as the midpoint of the graphics window.The first y-coordinate 'y1'
		 * is the midpoint of the graphics window added to half of the height of the box.
		 * The second x-coordinate 'x2' is on the left side of the graphics window in the
		 * middle of the 'Graphics Program' box, which is calculated by the formula below.
		 * the second y-coordinate is calculated by adding the line length to y1.*/
		
		int x1=getWidth()/2; 
		int y1=getHeight()/2 + box_height/2;
		int x2=getWidth()/2 - (box_width+distance_between_boxes);
		int y2=y1 + line_length;
		
		GLine Line1= new GLine (x1,y1,x2,y2);
		add(Line1); //Creates the line.
		
	}
	
	private void drawBoxGraphicsProgram(){
		/**Calculates x and y coordinates of the Graphics Program box*/
		int x=getWidth()/2 - (2*box_width+distance_between_boxes) + box_width/2;
		int y=getHeight()/2 + box_height/2 + line_length;
		
		/**Creates the Graphics Program box using the specified x and y coordinates.*/
		GRect Box2 = new GRect (x,y,box_width,box_height);
		add(Box2);
		
		/**Creates a new label 'Graphics Program' but places it on top of the box.*/
		GLabel GProgram = new GLabel ("Graphics Program",x,y);
		add(GProgram);
		
		/**Calculates the actual location of the 'Graphics Program' label*/
		double label_height = box_height/2 + GProgram.getAscent()/2;
		double label_width = box_width/2 - GProgram.getWidth()/2;
		GProgram.move(label_width, label_height);
		
	}
	
	private void lineToConsoleProgram(){
		
		/**This is a straight line dropped straight down from to 'Program box'
		 * to the 'Graphics Program' box. x1 and x2 coordinates remain unchanged.
		 * The first y-coordinate is the midpoint of the box added to half of the height of the box.
		 * The second y-coordinate is the length of the line added to the first y-coordinate.*/
		
		int x1=getWidth()/2;
		int y1=getHeight()/2 + box_height/2;
		int x2=getWidth()/2;
		int y2=y1 + line_length;
	
		GLine Line2= new GLine (x1,y1,x2,y2);
		add(Line2);	//Creates the line.
		
	}
	
	private void drawBoxConsoleProgram(){
		
		/**Calculates x and y coordinates of the Console Program box*/
		int x=getWidth()/2 - box_width/2;
		int y=getHeight()/2 + box_height/2 + line_length;
		
		/**Creates the Console Program box using the specified x and y coordinates.*/
		GRect Box2 = new GRect (x,y,box_width,box_height);
		add(Box2);
		
		/**Creates a new label 'Console Program' but places it on top of the box.*/
		GLabel CProgram = new GLabel ("Console Program",x,y);
		add(CProgram);
		
		/**Calculates the actual location of the 'Console Program' label*/
		double label_height = box_height/2 + CProgram.getAscent()/2;
		double label_width = box_width/2 - CProgram.getWidth()/2;
		CProgram.move(label_width, label_height);
		
	}
	
	
	
	private void lineToDialogProgram(){
		
		/**The first x-coordinate 'x1' is the midpoint of the box which is
		 * the same as the midpoint of the graphics window.The first y-coordinate 'y1'
		 * is the midpoint of the graphics window added to half of the height of the box.
		 * The second x-coordinate 'x2' is on the right side of the graphics window in the
		 * middle of the 'Graphics Program' box, which is calculated by the formula below.
		 * the second y-coordinate is calculated by adding the line length to y1.*/
		
		int x1=getWidth()/2;
		int y1=getHeight()/2 + box_height/2;
		int x2=getWidth()/2 + (box_width+distance_between_boxes);
		int y2=y1 + line_length;
		
		GLine Line1= new GLine (x1,y1,x2,y2);
		add(Line1);
		
	}
		
	private void drawBoxDialogProgram(){
		
		/**Calculates x and y coordinates of the Dialog Program box*/
		int x=getWidth()/2 + (box_width+distance_between_boxes) - box_width/2;
		int y=getHeight()/2 + box_height/2 + line_length;
		
		/**Creates the Dialog Program box using the specified x and y coordinates.*/
		GRect Box2 = new GRect (x,y,box_width,box_height);
		add(Box2);
		
		/**Creates a new label 'Dialog Program' but places it on top of the box.*/
		GLabel DProgram = new GLabel ("Dialog Program",x,y);
		add(DProgram);
		
		/**Calculates the actual location of the 'Dialog Program' label*/
		double label_height = box_height/2 + DProgram.getAscent()/2;
		double label_width = box_width/2 - DProgram.getWidth()/2;
		DProgram.move(label_width, label_height);
		
	}

		
		
		
	
}

