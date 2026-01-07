package java8.lambdaexpression.assignment;

import java.util.Scanner;

@FunctionalInterface
interface Calculator{
	int operation(int a,int b);
}

public class CalculatorUsingLambda {
	
	public static void main(String[] args) {
		
		// Lambda Expressions
		Calculator add=(a,b)->{ return a+b; };
		Calculator sub=(a,b)->{ return a-b; };
		Calculator mul=(a,b)->{ return a*b; };
		Calculator div=(a,b)->{ 
			if(b==0) {
				throw new ArithmeticException("Cannot divide by zero");
			}
			return a/b; 
		};
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter first number: ");
        int a=sc.nextInt();
        
        System.out.print("Enter second number: ");
		int b=sc.nextInt();
		
		System.out.println("\nChoose Operation:");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		
		int choice=sc.nextInt();
		
		try {
			switch (choice) {
			case 1:
				System.out.println("Addition is: "+add.operation(a,b));
				break;
			case 2:
				System.out.println("Subtraction is: "+sub.operation(a,b));
				break;
			case 3:
				System.out.println("Multiplication is: "+mul.operation(a,b));
				break;
			case 4:
				System.out.println("Division is: "+div.operation(a,b));
				break;
			default:
				System.out.println("Wrong choice try again!");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		sc.close();
	}
}
