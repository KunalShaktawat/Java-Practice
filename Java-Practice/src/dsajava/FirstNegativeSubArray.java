package dsajava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNegativeSubArray {
	public static void main(String[] args) {
		Queue<Integer> queue=new LinkedList<Integer>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
		int k = 3;

		for(int i=0;i<arr.length;i++) {
			if(arr[i]<0) {
				queue.add(i);
			}
			if(i>=k-1) {
				while(!queue.isEmpty()&&queue.peek()<i-k+1) {
					queue.poll();
				}
				if(!queue.isEmpty()) {
					list.add(arr[queue.peek()]);
				}else {
					list.add(0);
				}
			}
		}
		System.out.println(list);
		
	}
 
}
