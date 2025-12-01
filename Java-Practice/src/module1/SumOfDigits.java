package module1;

public class SumOfDigits {
	public static void main(String[] args) {
		int num=8765;
		int digit;
		int sum=0;
		while(num>0) {
			digit=num%10;
			sum=sum+digit;
			num=num/10;
		}
		System.out.println(sum);
	}

}
