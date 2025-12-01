package module1;

import java.util.Scanner;

public class ArmstrongFind {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int n=num;
		int power=0;
		
		while(n>0) {
			power++;
			n=n/10;
		}
		
		n=num;
		int sum=0;
		
		while(n>0) {
			int digit=n%10;
			sum+=Math.pow(digit,power);
			n=n/10;
		}
		
		System.out.println(sum);
		
	}

}
