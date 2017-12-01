package golff;

import java.util.Scanner;

public class golf_game {

	public static void main(String[] args) {
		double angle ;
		int speed ;
		double angleInRadian ;
		double distance  ;
		final double gravity = 9.8;
		Scanner scan = new Scanner( System.in);
		final double goal = 450;
		double disFTheG;
		boolean condtion = true;
		
		
		

		System.out.println("Welcome to the golf game:");
		System.out.println("Goal up to 450 meters, you have ten attempts maximum.");
			while (condtion) {
			 	for (int swing = 0; swing < 10 ; swing++) {
					
				
				angle = getAngle();
				
				System.out.println("please enter the speed:");
				speed = scan.nextInt();
				
				angleInRadian = (Math.PI/180)*angle;
				distance = Math.pow(speed,2)/gravity*Math.sin(2*angleInRadian);
				
				
				System.out.println("The distance is " + distance );
				 disFTheG = (goal- distance);
				 disFTheG = (disFTheG <0 ? -disFTheG :disFTheG);
				 System.out.println("the distance from the goal is " + disFTheG);
				 
				 	
				 if (disFTheG <= 0.1) {
					 System.out.println("***congratulation you get the goal**** ");
					 break;
				 	}
				 }
			 	System.out.println("You have exceeded the limit of strikes");
			 	break;
			 	}
	
			 }
	
	
	public static double getAngle() {
		double angle=0;
		boolean condtion = true;
		Scanner scan = new Scanner(System.in);
		while (condtion) {
		System.out.println("please enter the angle :");
		angle =scan.nextDouble();
		
			if (angle < 1 || angle > 89) {
				System.out.println(" the angle must be between (0-90)");
				
			}else {condtion = false;}
			}return angle;}

}
