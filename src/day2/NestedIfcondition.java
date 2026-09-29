package day2;

import java.util.Scanner;

public class NestedIfcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             Scanner sc= new Scanner(System.in);
		//percent=90 //DIST		
		//percent=85 first class
		//percent=70 second class
		//percent= 60 third class
	  //percent=40 pass 
           //else=fail
             System.out.println("the percentage is = ");
		double percentage=sc.nextDouble();
		
		if(percentage >=90) {
			System.out.println("DIST");
			}
		else if(percentage >=85) {
			System.out.println("first class");
			}
		else if(percentage >=70) {
			System.out.println("second class");
			}
		else if(percentage >=40) {
			System.out.println("third class");
			
		}
		else {
			System.out.println("otherwise fail");
		}
	}

}
