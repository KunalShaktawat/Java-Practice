package module1; 

import java.util.Scanner;

public class SumOddEvenDigit {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num= sc.nextInt();
		int sumOfEven=0;
		int sumOfOdd=0;
		while(num>0) {
			int digit=num%10;
			if(digit%2==0) {
				sumOfEven=sumOfEven+digit;
			}else {
				sumOfOdd=sumOfOdd+digit;
			}
			num=num/10;
		}
		System.out.println("Even Sum= "+sumOfEven);
		System.out.println("Odd Sum= "+sumOfOdd);
	}

}
