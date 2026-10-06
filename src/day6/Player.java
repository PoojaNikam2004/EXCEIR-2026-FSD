package day6;

import java.util.Scanner;

public class Player {

	private int jarsino;
	private String name;
	private double match;
		
	
        public void acceptPlayer()
                 {
	            Scanner sc=new Scanner(System.in);
	            
	          System.out.println("Please enter Jarsinumber");  //101
	          jarsino=sc.nextInt();
	
	          System.out.println("Please enter Player name");  //Alice
	             name=sc.next();
	
	                System.out.println("Please enter Match");  //78.5
	                match=sc.nextDouble();
}
        public void displayPlayer()
		{
			System.out.println("Roll Number is "+jarsino); //Roll Number is 101
			System.out.println("Student name "+name);  //Student name Alice
			System.out.println("Percentage is "+match);  //Percentage is 78.5
		
	
}

        
}



