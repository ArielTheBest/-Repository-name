package com.example.classroomcontroller;

import java.util.Scanner;

public class Application {
	
	public static void main(String[] args) {
	
		Controller controller = new Controller();
		try (Scanner scanner = new Scanner(System.in)) {
			String option;
			do {
				System.out.println("\n*************Classroom Controller*************");
				System.out.println("1. A");
				System.out.println("2. R");
				System.out.println("3. L");
				System.out.println("4. O");
				System.out.println("5. Q");
				System.out.print("Please select the appropriate option: ");
				option = scanner.nextLine();
				switch(option.toUpperCase()) {
					case "A" : 
							controller.addStudent();
						break;
					case "R" :
							controller.removeStudent();
						break;
					case "L" :
							controller.onLights();
						break;
					case "O" :
							controller.offLights();
						break;
					case "Q" :
						System.out.println("Classroom Controller Stopped Successfully");
						System.exit(0);
						break;
					default :
						System.out.println("Please enter a valid choice");
						break;
					}
				} while(option != "Q");
			
			} catch(NullPointerException nullPointerException) {
				nullPointerException.printStackTrace();
			} catch(Exception exception) {
				exception.printStackTrace();
			} 	
		
	}

}
