package dsajava;

public class LongestSubstringStrinbuff {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		String s="thenaameies";
	    int index=0;
	    int curr_l=0;
	    int maxLength=Integer.MIN_VALUE;
		for(int i=0;i<s.length();i++) { 
			if(sb.indexOf(Character.toString(s.charAt(i)))!=-1) {
				index=sb.indexOf(Character.toString(s.charAt(i)));
				sb.delete(0, index+1);
			}
			sb.append(Character.toString(s.charAt(i)));
			curr_l=sb.length();
			maxLength=Math.max(maxLength,curr_l);
		}
		System.out.println(maxLength);
	}

}
