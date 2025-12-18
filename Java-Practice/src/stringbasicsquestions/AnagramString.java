package stringbasicsquestions;

import java.util.Arrays;

public class AnagramString {
	public static void main(String[] args) {
		String s1="List een";
		String s2="Silent";
		char[] ch1=s1.toLowerCase().replace(" ", "").toCharArray();
		char[] ch2=s2.toLowerCase().replace(" ", "").toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2)) {
			System.out.println("Anagram");
		}else {
			System.out.println("Not Anagram");
		}
		
	}

}
