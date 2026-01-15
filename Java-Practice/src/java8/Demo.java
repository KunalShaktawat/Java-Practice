 package java8;

interface A{
	 public boolean checkSinglDigit(int x);
 }
 class Digit{
	 public static boolean checkSingleDigit(int x) {
		 return x>-10 && x<10;
	 }
 }
 interface P{
	 int lengthString(String s);
 }
 class ImP{
	 public static int lengthofName(String s) {
		 return s.length();
	 }
 }
public class Demo {
	public static void main(String[] args) {
		A a2=Digit::checkSingleDigit;
		System.out.println(a2.checkSinglDigit(5));
		
		P p=ImP::lengthofName;
		System.out.println(p.lengthString("Kunal"));
	}
}
