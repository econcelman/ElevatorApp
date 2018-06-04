import java.util.Scanner;


public class Building {
	
	//Runs a simple elevator program.  It lets users input which floor they are currently on, 
	//and then which floor they would like to go too. 
	
	public static void main(String[] args) {
	Elevator elevator = new Elevator(); 
		
	int floor;
	Scanner scan = new Scanner(System.in);
	 
	
	 System.out.println("Welcome! Please enter the current floor number (0,1,2) that you are on.");
		floor  = scan.nextInt();
		scan.nextLine();

		elevator.callElevator(floor);
		elevator.moveToFloor();
		
	}
}

		
		
	


