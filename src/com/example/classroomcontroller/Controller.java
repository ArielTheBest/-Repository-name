package com.example.classroomcontroller;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
	
	static Scanner scanner = new Scanner(System.in);
	public static int studentsCount = 0;
	public static ArrayList<Integer> onLightsList = new ArrayList<Integer>();
	
	public void addStudent(){
		System.out.print("Enter the number of students to be added: ");
		int addStudent = scanner.nextInt();
		System.out.println(addStudent + " students added successfully.");
		studentsCount = studentsCount + addStudent;
		System.out.println(studentsCount + " students present.");
	}
	
	public void removeStudent(){
		System.out.print("Enter the number of students to be removed: ");
		int removeStudentCount = scanner.nextInt();
		if (removeStudentCount > studentsCount){
			studentsCount = 0;
		} else {
			studentsCount = studentsCount - removeStudentCount;
		}
		System.out.println(removeStudentCount + " students removed successfully.");
		System.out.println(studentsCount + " students present.");
	}

	public void onLights(){
		if (onLightsList.size() > 2){
			System.out.println("Currently all the lights are on.");
		} else if (onLightsList.size() == 0){
			System.out.println("Currently all lights are off.");
			Controller.lights();
		}else {
			System.out.println("Light(s) " + onLightsList + "  are on.");
			Controller.lights();
		}
		
	}

	public void offLights(){
		System.out.print("Enter the number of the light to be off (1/2/3): ");
		int offLight = scanner.nextInt();
		if (onLightsList.contains(offLight)){
			int elementIndex = onLightsList.indexOf(offLight);
			onLightsList.remove(elementIndex);
			System.out.println("Light " + offLight + "  is off");
		} else {
			System.out.println(offLight + " light is already off");
		}		
	}
	
	public static void lights() {
		System.out.print("Enter the number of the light to be on (1/2/3): ");
		int onLight = scanner.nextInt();
		if (!onLightsList.contains(onLight)){
			onLightsList.add(onLight);
			System.out.println("Light " + onLight +" is on.");
		} else {
			System.out.println(onLight + " light is already on.");
		}
	}
	
}
