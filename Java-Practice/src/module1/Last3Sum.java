package module1;

import java.util.Scanner;

public class Last3Sum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int d,sum=0;
		int i=3;
		while(num>0 && i>=1) {
			d=num%10;
			sum=sum+d;
			num=num/10;
			i--;
		}
		System.out.println(sum);
	}

}
