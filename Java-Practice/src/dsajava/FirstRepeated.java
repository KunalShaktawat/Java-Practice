package dsajava;

import java.util.HashSet;

public class FirstRepeated {
	
	public static void main(String[] args) {
		// Find first repeated element in an array using brute force
		int[] arr= {1,2,3,4,3,2,5};
		outerLoop:
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("First repeated element is: "+arr[i]);
					break outerLoop;
				}
			}
		}
		// Find first repeated element in an array using hashset
		int[] arr2= {1,2,3,4,3,2,5};
		HashSet<Integer> set=new HashSet<>();
		for(int n:arr2) {
			if(set.contains(n)) {
				System.out.println("First Duplicate element is: "+n);
				break;
			}
			set.add(n);
		}
		int[] arr3 = {4, 2, 1, 2, 5, 4};
		int firstRepeat = -1;

		for (int i = 0; i < arr.length; i++) {
		    for (int j = i + 1; j < arr.length; j++) {
		        if (arr3[i] == arr3[j]) {
		            firstRepeat = arr3[i];
		            break;  // break inner loop
		        }
		    }
		    if (firstRepeat != -1) {
		        break;  // break outer loop
		    }
		}

		System.out.println("First repeated element: " + firstRepeat);

		
	}

}
