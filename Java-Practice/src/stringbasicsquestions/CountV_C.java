package stringbasicsquestions;

public class CountV_C {
	public static void main(String[] args) {
		String s="Kuna l";
		s=s.toLowerCase();
		int v=0;
		int c=0;
		for(int i=0;i<s.length();i++) {
			if("aeiou".indexOf(s.charAt(i))!=-1) {   // we can also use (ch=='a'||ch=='e');
				v++;
			}else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				c++;
			}
		}
		System.out.println("Vowle Count: "+v);
		System.out.println("Consonat Count: "+c);
	}

}
