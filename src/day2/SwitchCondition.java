package day2;


import java.util.Scanner;

public class SwitchCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//choice 1. Pink
		//choice 2. red
		//choice 3. white
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("choose the colour");
		System.out.println("1. pink");
		System.out.println("2. red");
		System.out.println("3. white");
		
		int choice = sc .nextInt();
		
		switch (choice) {
			case 1:
				System.out.println("you are selected pink colour");
				break ;
			case 2:
				System.out.println("you are selected red colour");
				break ;
			case 3:
				System.out.println("you are selected white");
				break;
				default:
					System.out.println("Invalide choice");
					
		}
				

	}

}
