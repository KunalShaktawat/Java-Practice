package regexsheet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ThirdMaximumNumber {
	// Optimal
	public static int thirdMax2(int[] nums) {
        long n1=Long.MIN_VALUE,n2=Long.MIN_VALUE,n3=Long.MIN_VALUE;
        for(int n:nums){
            if(n==n1 || n==n2 || n==n3){
                continue;
            }
            if(n>n1){
                n3=n2;
                n2=n1;
                n1=n;
            }else if(n>n2){
                n3=n2;
                n2=n;
            }else if(n>n3){
                n3=n;
            }
        }
        if(n3==Long.MIN_VALUE){
            return (int) n1;
        }else{
            return (int) n3;
        }
    }
	
	public static int thirdMax(int[] nums) {
        Set<Integer> set=new TreeSet<Integer>(Collections.reverseOrder());
        for(int i:nums){
            set.add(i);
        }
        List<Integer> list=new ArrayList<Integer>(set);
        if(list.size()<3){
            return list.get(0);
        }
        else{
            return list.get(2);   
        }
    }
	
	public static void main(String[] args) {
		int nums[]= {1,2,2,3};
		System.out.println(thirdMax2(nums));
	}

}
