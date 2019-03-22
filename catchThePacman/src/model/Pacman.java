package model;

public class Pacman {

	public final static String PATH_TXT_LVL0 = "data/level0.txt";
	public final static String PATH_TXT_LVL1 = "data/level1.txt";
	public final static String PATH_TXT_LVL2 = "data/level2.txt";
	
	private double startX;
	private double startY;
	private double radiusX;
	private double radiusY;
	private double startAngle;
	private double lenght;
	
	private Movement direction;
	
	public final static double ADVANCE = 10.0;
	
	public Pacman(double sX, double sY, double rX, double rY, double sAngle, double len){
		startX = sX;
		startY = sY;
		radiusX = rX;
		radiusY = rY;
		startAngle = sAngle;
		lenght = len;
		
		if(sX==39.0 && sY!=39.0) {
			direction = Movement.FORWARD;
		}else if(sY==39.0 && sX!=39.0) {
			direction = Movement.DOWN;
		}
	}

	public void move(double max) {
		
		switch(direction) {
			case FORWARD:
				if(startX+ADVANCE+radiusX>max) {
					direction = Movement.BACKWARD;
					startX = max-radiusX;
				}else {
					startX = startX+ADVANCE;					
				}
			break;
			case BACKWARD:
				if(startX-ADVANCE-radiusX<0) {
					direction = Movement.FORWARD;
					startX = radiusX;
				}else {
					startX = startX-ADVANCE;					
				}
			break;
			case DOWN:
				if(startY+ADVANCE+radiusY>max) {
					direction = Movement.BACKWARD;
					startY = max-radiusY;
				}else {
					startY = startY+ADVANCE;					
				}
			break;
			case UP:
				if(startY-ADVANCE-radiusY<0) {
					direction = Movement.FORWARD;
					startY = radiusY;
				}else {
					startY = startY-ADVANCE;					
				}
			break;
		}
	}
	
}
