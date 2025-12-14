package string;

public class ReverseComplete {
	public static void main(String[] args) {
		String s="Hello World!";
		StringBuilder sb=new StringBuilder(s);
		sb.reverse();
		s=sb.toString();
		System.out.println(s);
		//
		String s1="naman";
		char[] ch=s1.toCharArray();
		int start=0;
		int end=ch.length-1;
		while(start<end) {
			char temp=ch[start];
			ch[start]=ch[end];
			ch[end]=temp;
			start++;
			end--;
		}
		System.out.println(new String(ch));
		if(new String(ch).equals(s1)) {
			System.out.println("Pallindrome");
		}else {
			System.out.println("Not Pallindrome");
		}
	}

}
