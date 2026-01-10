package dsajava;
public class Sum {
	static int fib(int num) {
		if(num==1) {
			return 1;
		}
		if(num==0) {
			return 0;
		}
		return fib(num-1)+fib(num-2);
	}
	static int factorial(int num) {
		if(num==1) {
			return 1;
		}
		return num*factorial(num-1);
	}
	static int sum(int num) {
		if(num==1) {
			return 1;
		}
		return num+sum(num-1);
	}
	public static void main(String[] args) {
		System.out.println(sum(2));
		System.out.println(factorial(4));
		System.out.println(fib(6));
	}
	
}
