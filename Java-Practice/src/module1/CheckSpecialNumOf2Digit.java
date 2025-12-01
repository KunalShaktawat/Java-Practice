package module1;
import java.util.Scanner;
public class CheckSpecialNumOf2Digit {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the two digit number");
		int num=sc.nextInt();
		int temp=num;
		int d,sum=0,product=1;
		while(num>0) {
			d=num%10;
			sum=sum+d;
			product=product*d;
			num=num/10;
		}
		int result=sum+product;
		System.out.println(result);
		if(result==temp) {
			System.out.println("Special Number");
		}else {
			System.out.println("Not Special");
		}	
		
	}

}
