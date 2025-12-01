package module2;
//Q.2 Calculate the sum of all the elements of an array.
public class Practic02 {
	public static void main(String[] args) {
		int arr[]= {10,11,12,20,13,30,14,40};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}

}
