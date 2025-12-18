package stringbasicsquestions;

import java.util.Set;
import java.util.LinkedHashSet;

public class RemoveDuplicates {
	public static void main(String[] args) {
	/*
		Set<Character> set=new LinkedHashSet<>();
		String s="Java";
		for(char c:s.toCharArray()) {
			set.add(c);
		}
	*/
		String s="Javajavaz";
		String s2="";
		for(int i=0;i<s.length();i++) {
			if(s2.indexOf(s.charAt(i))==-1) {
				s2+=s.charAt(i);
			}
		}
		System.out.println(s2);
	}

}
