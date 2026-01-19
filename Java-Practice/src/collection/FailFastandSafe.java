package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailFastandSafe {
	public static void main(String[] args) {
		// Fail fast
//		ArrayList<Integer> list=new ArrayList<Integer>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(60);
//		for(Integer i:list) {
//			System.out.println(i);
//			if(i==20) {
//				list.add(80);
//			}
//		}
//		System.out.println(list);
		
		// Fail Safe
		CopyOnWriteArrayList<Integer> list2=new CopyOnWriteArrayList<Integer>();
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(60);
		for(Integer i:list2) {
			System.out.println(i);
			if(i==20) {
				list2.add(80);
			}
		}
		System.out.println(list2);
	}
}
