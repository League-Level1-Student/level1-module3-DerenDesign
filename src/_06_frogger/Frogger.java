package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    
    @Override
    public void settings() {
        size(WIDTH, HEIGHT);
        
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    	background(0,0,255);
    	fill(0,255, 0);
    	ellipse(400, 500, 50, 50);
    }
    int xPos = 0;
    public class xPos{
  	 
      }
    int yPos = 0;
    public class yPos{
  	  
      }
    public void stayIn(){
    	if(xPos > 800 && yPos > 600) {
    		xPos = 400;
    		yPos = 500;
    	}
    }
    public void keyPressed()
    {
        if(key == CODED){
            if(yPos == UP)
            {
                //Frog Y position goes up
            }
            else if(-yPos == DOWN)
            {
                //Frog Y position goes down 
            }
            else if(xPos == RIGHT)
            {
                //Frog X position goes right
            }
            else if(-xPos == LEFT)
            {
                //Frog X position goes left
            }
        }
    }
  
 
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
