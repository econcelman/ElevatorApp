import java.util.Scanner;

public class Elevator {
	
	private int currentFloor;
	private boolean open;
	String message;
	
	
	// Sets doors to close
	public Elevator() {
		this.open = false;
        this.currentFloor = 0;
    }

	
    public void closeDoors() {
    	open = false;
    	String message = "Elevator doors are closed";
    	System.out.println(message);
    }
    
    public void openDoors() {
    	open = true;
    	String message = "Elevator doors are open";
    	System.out.println(message);
    }
    	
    
    
	 public void callElevator(int floor) {
	
			if (floor == currentFloor) {
				message = "Elevator is on the current floor";
				System.out.println(message);
				}
			
			if (floor > currentFloor) {
				message = "Going up!";
				System.out.println(message);
				}
			
			if (floor < currentFloor) {
				message = "Going down";
				System.out.println(message);
				}
			
			currentFloor = floor;
			System.out.println("elevator on floor " + currentFloor);
			openDoors();
			
	 }
 
	 public void moveToFloor() {
	 	Scanner scan = new Scanner(System.in);
	 	int requestedFloor, moveFloors;
	 	
	 	System.out.println("Please enter the elevator.");		
	 	System.out.println("what floor (0,1,2) you would like to go to?");
	 	requestedFloor = scan.nextInt();
	 	scan.nextLine();
	 	
	 		while (currentFloor == requestedFloor) {
 			System.out.println("Invalid request: you are currently on floor" + requestedFloor);
 			System.out.println("Please enter the floor (0,1,2) you would like to go to.");
 			requestedFloor = scan.nextInt();
 			scan.nextLine();
	 		}
	 	
	 		if (currentFloor > requestedFloor) {
	 			moveFloors = currentFloor - requestedFloor;
	 			closeDoors();
	 			System.out.println("Going Down " + moveFloors + " floor(s)");
	 			currentFloor = requestedFloor;
	 			}
	 		
	 		if (currentFloor < requestedFloor) {
	 			moveFloors = requestedFloor - currentFloor;
	 			closeDoors();
	 			System.out.println("Going up " + moveFloors + " floor(s)");
	 			currentFloor = requestedFloor;
	 			}
	 		
	 		System.out.println("Elevator at floor " + currentFloor);
	 		openDoors();
	 		System.out.println("Please exit the elevator");
	 		closeDoors();
	 		
	 }
	 			
	 		
}
	 
	 
 
		
		
	