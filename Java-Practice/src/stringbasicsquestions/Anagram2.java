package stringbasicsquestions;

import java.util.Arrays;

public class Anagram2 {
	public static void main(String[] args) {
		String s1="Listen  s";
		String s2="Sile nts";
		char[] ch1=s1.toLowerCase().replace(" ", "").toCharArray();
		char[] ch2=s2.toLowerCase().replace(" ", "").toCharArray();
		if(ch1.length!=ch2.length) {
			System.out.println("Not Anagram");
		}else {
			
			int[] arr1=new int[256];
			for(char c:ch1) {
				arr1[c]++;
			}
			int[] arr2=new int[256];
			for(char c:ch2) {
				arr2[c]++;
			}
			if(Arrays.equals(arr1, arr2)) {
				System.out.println("Anagram");
			}else {
				System.out.println("Not Anagram");
			}
			

		}
				
	}
}
