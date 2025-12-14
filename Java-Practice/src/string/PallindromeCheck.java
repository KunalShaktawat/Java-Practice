package string;

public class PallindromeCheck {
	public static void main(String[] args) {
		String str="nnaman";
		String demo="";
		for(int i=str.length()-1;i>=0;i--) {
			demo=demo+str.charAt(i);
		}
		System.out.println(demo);
		if(demo.equals(str)) {
			System.out.println("Pallindrome");
		}else {
			System.out.println("Not Pallindrome");
		}
	}

}
