package _02_robot_graffiti;

import java.nio.charset.MalformedInputException;

import org.jointheleague.graphical.robot.Robot;

public class Robotgraffiti {
public static void main(String[] args) {
	Robot goku = new Robot ();
	goku.penDown();
	goku.setSpeed(100);
	for (int i = 0; i < 4; i++) {
	goku.move(150);
	goku.turn (90);


	}	
	
	
	
}
	
}

