package _06_frogger;

import processing.core.PApplet;
import processing.core.PImage;

public class Frogger extends PApplet {
	static final int WIDTH = 800;
	static final int HEIGHT = 600;
	PImage back;
	 PImage carLeft;
	 PImage carRight;
	 PImage frog;
	@Override
	public void settings() {
		size(WIDTH, HEIGHT);
	    

	}

	Car car = new Car(400, 300, 150, 10);
	Car car2 = new Car(400, 200, 250, 10);

	boolean intersects(Car car) {
		if ((y > car.getY() && y < car.getY() + 50) && (x > car.getX() && x < car.getX() + car.getSize())) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public void setup() {
		car.display();
		car2.display();
		

	}

	int x = 400;
	int y = 500;
	int w = 50;
	int h = 50;

	@Override
	public void draw() {

		background(0, 0, 255);
		fill(0, 255, 0);
		ellipse(x, y, w, h);
		car.SpeedLeft();
		car.display();
		car2.SpeedRight();
		car2.display();
		if(intersects(car)) {
			x = 400;
			y = 500;
		}
		if(intersects(car2)) {
			x = 400;
			y = 500;
		
		}
		stayIn();
		
	}

	int xPos = 0;

	public class xPos {

	}

	int yPos = 0;

	public class yPos {

	}

	public void stayIn() {
		if (x >= 800 || x <= 0 || y >= 600 || y <= 0) {
			x = 400;
			y = 500;
		}
	}

	public void keyPressed() {
		if (key == CODED) {
			if (keyCode == UP) {
				y-=5;
			} else if (keyCode == DOWN) {
				y+=5;
			} else if (keyCode == RIGHT) {
				x+=5;
			} else if (keyCode == LEFT) {
				x-=5;
			}
		}
	}

	class Car {
		
		int xPos;
		int yPos;
		int Size;
		int Speed;

		Car(int xPos, int yPos, int Size, int Speed) {
			this.xPos = xPos;
			this.yPos = yPos;
			this.Size = Size;
			this.Speed = Speed;

		}

		void display() {
			fill(0, 255, 0);
			rect(xPos, yPos, Size, 50);
		}

		void SpeedLeft() {
			xPos = xPos - Speed;
			if (xPos <= 0) {
				xPos = 800;
			}
		}

		void SpeedRight() {
			xPos = xPos + Speed;
			if (xPos >= WIDTH) {
				xPos = 0;
			}
		}

		public int getX() {
			return xPos;
		}

		public int getY() {
			return yPos;
		}

		public int getSize() {
			return Size;
		}
		

	}
	 

	static public void main(String[] args) {
		PApplet.main(Frogger.class.getName());
	}
}
