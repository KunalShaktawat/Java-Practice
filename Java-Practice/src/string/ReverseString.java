package string;

public class ReverseString {
	public static void main(String[] args) {
		String str=new String("Hello world");
		String str2="Hello";
		String str3="Hello";
		System.out.println(str.charAt(4)+" "+str.length());
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
		char[] ch=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			System.out.println(ch[i]);
		}
		System.out.println(str.equals(str2));
		System.out.println(str2.equals(str3));
		String demo="";
		for(int i=str.length()-1;i>=0;i--) {
			demo+=str.charAt(i);
		}
		System.out.println(demo);
	}
         
}
