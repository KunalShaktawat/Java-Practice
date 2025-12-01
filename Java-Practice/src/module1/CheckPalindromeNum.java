package module1;

public class CheckPalindromeNum {
	public static void main(String[] args) {
		int num=453;
		int temp=num;
		int rev=0;
		int d;
		while(temp>0) {
			d=temp%10;
			rev=rev*10+d;
			temp=temp/10;
		}
		if(rev==num) {
			System.out.println("Number is pallindrome");
		}else {
			System.out.println("Number is not pallindrome");
		}
	}

}
