package stringbasicsquestions;

import java.util.HashSet;

public class DupliChar {
	public static void main(String[] args) {
		HashSet<Character> set= new HashSet<Character>();
		String s="Javaavaa";
		String s2="";
		char[] ch=s.toCharArray();
		for(int i=0;i<ch.length;i++) {
			if(s2.indexOf(s.charAt(i)) ==-1) {
				s2+=s.charAt(i);
			}
			else {
				set.add(s.charAt(i));
			}
			
		}
		System.out.println(set);
		
	}

}
