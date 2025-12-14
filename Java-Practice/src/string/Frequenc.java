package string;

import java.util.HashSet;

public class Frequenc {
	public static void main(String[] args) {
		String str="banana";
		HashSet<Character> set=new HashSet<>();
		int count=0;
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(set.contains(ch)) {
			count++;
			}
			set.add(ch);
		}
		System.out.println(set);
	}

}
