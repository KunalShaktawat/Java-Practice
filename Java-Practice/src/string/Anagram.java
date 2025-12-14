package string;

import java.util.Arrays;

public class Anagram {
	static boolean isAnagram(String s1,String s2) {
		if(s1.length()!=s2.length()) {
			return false;
		}
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
	    Arrays.sort(ch2);
		int idx1=0;
		int idx2=0;
		for(int i=0;i<ch1.length;i++) {
			if(ch1[idx1]!=ch2[idx2]) {
				return false;
			}
			idx1++;
			idx2++;
		}
		return true;
		
	}
	public static void main(String[] args) {
		String s1="banana";
		String s2="nanaba";
		boolean result=isAnagram(s1,s2);
		if(result) {
			System.out.println("Anagrams");
		}else {
			System.out.println("Not anagrams");
		}
	}

}
