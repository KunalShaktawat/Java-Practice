package string;

public class Vowelsconsonants {
	public static void main(String[] args) {
		String str="K12unalSingh";
		int countVowel=0;
		int countCons=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				countVowel++;
			}else if(ch>='a' && ch<='z') {
				countCons++;
			}
		}
		System.out.println("Vowels: "+countVowel);
		System.out.println("Consonants "+countCons);
	}

}
