package module2;


// Linear Search 
//Q. Find the element x in the array x is input
public class Practice03 {
	public static void main(String[] args) {
		int arr[]= {12,2,3,45,666,34,11};
		int x=45;
		for(int i=0;i<arr.length;i++) {
			if(x==arr[i]) {
				System.out.println(x+" is at index : "+i);
			}
		}
	}

}
