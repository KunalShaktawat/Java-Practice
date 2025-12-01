package module1;

public class SumOfPrime {
	public static void main(String[] args) {
		int num=254242;
		int d;
		int sum=0;
		while(num>0) {
			d=num%10;
			if(d==2||d==3||d==5|d==7) {
				sum=sum+d;
			}
			num=num/10;
		}
		System.out.println(sum);
	}

}
