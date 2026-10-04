package day3;
import java.util.Scanner;
public class FactorialUsingLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Scanner sc = new Scanner(System.in);

		        System.out.print("Enter a positive number: ");
		        int n = sc.nextInt();

		        int factorial = 1;

		        for (int i = 1; i <= n; i++) {
		            factorial = factorial * i;
		        }

		        System.out.println("Factorial = " + factorial);

		        sc.close();
		    }
		
	}


