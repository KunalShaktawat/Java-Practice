package java8;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalInterfaceTypes {
	public static void main(String[] args) {
		Predicate<Integer> p1=(n)-> n%2==0;
		System.out.println(p1.test(4));
		
		Predicate<Integer> p2=(n)-> n<10;
		System.out.println(p2.test(45));
		// and
		System.out.println(p1.and(p2).test(50));
		// or
		Predicate<Integer> p=p1.or(p2);
		System.out.println(p.test(4));
		// negate
		System.out.println(p1.and(p2).negate().test(60));
		
		Function<String,Integer> f1=s-> s.length();
		System.out.println(f1.apply("Kunal"));
		
		Consumer<String> c=s-> System.out.println("Hello");
		c.accept("Kunal");
		
		Supplier<Integer> s=()-> 12;
		System.out.println(s.get());
	}
}
