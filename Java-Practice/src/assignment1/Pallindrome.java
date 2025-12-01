package assignment1;

public class Pallindrome {
	public static void main(String[] args) {
		int num=567;
		int originalNum=num;
		int rev=0;
		while(num>0) {
			int d=num%10;
			rev=rev*10+d;
			num=num/10;
		}
		if(originalNum==rev) {
			System.out.println("Pallindrome");
		}else {
			System.out.println("Not pallindrome");
		}
	}

}
