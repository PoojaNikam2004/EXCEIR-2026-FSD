package day3;

import java.util.Scanner;
public class MenuDrivenProgramDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner (System.in);
		System.out.println("Enter the first number ");
		 int  num1=sc.nextInt();
		
		System.out.println("Enter the second number ");
	  int  num2=sc.nextInt();
		int choice=0;
		
		do 
		{
			System.out.println("***menu***");
		System.out.println("1. Addition ");
		System.out.println("2. substraction ");
		System.out.println("3. multiplication ");
		System.out.println("4. division ");
		System.out.println("invalid ");
		
 System.out.println("Enter the choice");
  choice=sc.nextInt();
  double result=0.0;
  
  switch(choice)
  {
  case 1: result = num1+num2; break;
  
  case 2: result =num1-num2; break;
  
  case 3: result =num1*num2; break;
  
  case 4: result =(double)num1/(double)num2; break;  //typecasting 
  case 0: System.exit(0);
  
	  default: System.out.println("invalide choice");
  
  }
  System.out.println("result" + result);
  
 }while(choice!=0) ;
		{
			System.out.println("thank you");
 }
	}

}
