package day2;

import java.util.Scanner;
public class AddHeightTwoPeople {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		
		System.out.println("the height of first man");
		double man1=sc.nextDouble();
		
		System.out.println("the height of second man");
		double man2=sc.nextDouble();
		
		double totalheight=man1+man2;
		
		System.out.println("the total height is" + totalheight);
		
		

	}

}
