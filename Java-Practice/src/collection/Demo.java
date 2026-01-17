package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo {
	public static void main(String[] args) {
		// Convert array to collections
		String arr[]= {"Java","Python","Spring"};
	    Integer arr2[]= {1,2,3,4};
		List<String> list=new ArrayList<String>(Arrays.asList(arr));
		List<Integer> list2=new ArrayList<Integer>(Arrays.asList(arr2));
		System.out.println(list);
		System.out.println(list2);
		// Array to collection
		List<String> list3=new ArrayList<String>();
		list3.add("Java");
		list3.add("C++");
		System.out.println(list3);
		String s[]=list3.toArray(new String[0]);
		for(String ss:s) {
			System.out.print(ss+" ");
		}  
		
	}

}
