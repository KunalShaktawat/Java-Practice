package stringbasicsquestions;

public class RemoveSpaces {
	public static void main(String[] args) {
		String s="Java is Pro ";
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb.toString());
	}

}
