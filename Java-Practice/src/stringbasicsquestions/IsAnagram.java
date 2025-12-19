package stringbasicsquestions;

public class IsAnagram {
	
	public static String lowerCase(String s) {
		String ls="";
		char[] temp=s.toCharArray();
		for(int i=0;i<temp.length;i++) {
			char c=s.charAt(i);
			if(c>='A' && c<='Z') {
				temp[i]=(char) (c+32);
			}
		}
		ls=String.valueOf(temp);
		return ls;
	}
	
	public static String removeSpace(String s) {
		String rs="";
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c!=' ') {
				rs+=s.charAt(i);
			}
		}
		return rs;
	}
	
	public static void main(String[] args) {
		String s1="List en";
		String s2="Silent";
		
		s1=lowerCase(s1);
		s2=lowerCase(s2);
		
		s1=removeSpace(s1);
		s2=removeSpace(s2);
		
		if(s1.length()==s2.length()) {
			
			char ch1[] =new char[256];
			for(int i=0;i<s1.length();i++){
				char c=s1.charAt(i);
				ch1[c]++;
			}
			
			char ch2[] =new char[256];
            for(int i=0;i<s2.length();i++){
            	char c=s2.charAt(i);
            	ch2[c]++;
			}
            
            boolean flag=true;
            for(int i=0;i<ch1.length;i++) {
            	if(ch1[i]!=ch2[i]) {
            		flag=false;
            		break;
            	}
            }
            
            if(flag) {
            	System.out.println("Anagram");
            }else {
            	System.out.println("Not anagram");
            }
            
		}
		else {
			System.out.println("Not anagram");
		}
		
	}

}
