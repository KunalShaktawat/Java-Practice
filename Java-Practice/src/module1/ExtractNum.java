package module1;

public class ExtractNum {
	public static void main(String[] args) {
		int num=8764;
		int digit;
		while(num>0) {
			digit=num%10;
			num=num/10;
			System.out.println(digit);
			
		}
		
	}

}
