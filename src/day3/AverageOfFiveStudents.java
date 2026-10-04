package day3;
import java.util.Scanner;
public class AverageOfFiveStudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     Scanner sc = new Scanner(System.in);

		        System.out.print("Enter marks of Subject 1: ");
		        int mark1 = sc.nextInt();

		        System.out.print("Enter marks of Subject 2: ");
		        int mark2 = sc.nextInt();

		        System.out.print("Enter marks of Subject 3: ");
		        int mark3 = sc.nextInt();

		        System.out.print("Enter marks of Subject 4: ");
		        int mark4 = sc.nextInt();

		        System.out.print("Enter marks of Subject 5: ");
		        int mark5 = sc.nextInt();

		        int total = mark1 + mark2 + mark3 + mark4 + mark5;

		        double average = total / 5.0;

		        System.out.println("Total Marks = " + total);
		        System.out.println("Average = " + average);

		        if (average >= 40) {
		            System.out.println("Student has Passed");
		        } 
		        else {
		            System.out.println("Student has Failed");
		        }

		        sc.close();
		    }
		}


