package string;

public class InternMethod {
	public static void main(String[] args) {
		String s1="Kunal";
		String s2=new String("Kunal");
		System.out.println(s1==s2);
		s2=s2.intern();     // returns the refrence of exisiting object in scp if not create new object in scp
		System.out.println(s1==s2);  // 
		
		StringBuffer sb=new StringBuffer("Kunal");
		System.out.println(sb.capacity());
		
		sb.append("aaaaaaaaaaaaaaaaa");
		
		System.out.println(sb.capacity());  // capacity=(Old capacity*2)+2;
		
		
	}

}
