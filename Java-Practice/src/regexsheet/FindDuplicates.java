package regexsheet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicates {
	public static List<Integer> findDuplicates(int[] nums) {
		List<Integer> list=new ArrayList<Integer>();
		Set<Integer> set=new HashSet<Integer>();
		for(int n:nums) {
			if(set.contains(n)) {
				list.add(n);
			}
			set.add(n);
		}
		return list;
	}
	public static void main(String[] args) {
		int nums[] = {4,3,2,7,8,2,3,1};
		System.out.println(findDuplicates(nums));
	}
}
