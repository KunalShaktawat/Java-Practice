package module2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDuplicateUsingHashset {
	public static void main(String[] args) {
		int[] arr= {1,2,2,4,5,6,5,3};
		HashSet<Integer> set1=new HashSet<Integer>();
		LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();
		TreeSet<Integer> set3=new TreeSet<Integer>();
		for(int num:arr) {
			set1.add(num);
			set2.add(num);
			set3.add(num);
		}
		System.out.println(set1);
		System.out.println(set2);
		System.out.println(set1);
	}

}
