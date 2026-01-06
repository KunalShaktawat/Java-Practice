package java8;

import java.util.function.Predicate;

@FunctionalInterface
interface I{
	void sum(int a,int b);
}

public class Test {
	public static void main(String[] args) {
		
		// Lambda Expression
		I i1=(a,b)-> System.out.println("Sum is :"+(a+b));
		i1.sum(10, 20);
		
		// Predicate 
		Predicate<Integer> p1=i -> {if(i%2==0) return true; else return false;};
		System.out.println(p1.test(12));
	}
}