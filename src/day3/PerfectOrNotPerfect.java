package day3;

import java.util.Scanner;

public class PerfectOrNotPerfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in) ;
		int sum=0;
		
		System.out.println("Enter your number");
		int num=sc.nextInt();
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum=sum+i;
			}
		}
		if(num==sum) {
			System.out.println(num +"is a perfect number");
		}
		else {
			System.out.println(num +"is a  not perfect number");
		}

	}

	}


