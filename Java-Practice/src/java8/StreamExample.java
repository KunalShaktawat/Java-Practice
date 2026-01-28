package java8;
import java.util.*;
import java.util.stream.*;

public class StreamExample {
    public static void main(String[] args) {

        // Arrays.asList creates a fixed-size list
        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 60, 70);

        // Print original list
        System.out.println("Original List: " + list);

        // ---------------------------------------------------
        // 1️⃣ Convert List → Stream
        // ---------------------------------------------------
        Stream<Integer> streamData = list.stream();

        // ---------------------------------------------------
        // 2️⃣ Sort elements using stream (does NOT change list)
        // ---------------------------------------------------
        Stream<Integer> sortedStream = streamData.sorted();
        System.out.println("\nSorted Elements:");
        sortedStream.forEach(n -> System.out.println(n));

        // List remains unchanged
        System.out.println("After sorting, List still: " + list);

        // ---------------------------------------------------
        // 3️⃣ Filter EVEN numbers
        // ---------------------------------------------------
        System.out.println("\nEven Numbers:");
        list.stream()
                .filter(i -> i % 2 == 0)  // keep only even numbers
                .forEach(i -> System.out.println(i));

        // ---------------------------------------------------
        // 4️⃣ Square each number (map operation)
        // ---------------------------------------------------
        System.out.println("\nSquare of each number:");
        list.stream()
                .map(n -> n * n)   // transform each element
                .forEach(i -> System.out.println(i));

        // ---------------------------------------------------
        // 5️⃣ Filter even → square them
        // ---------------------------------------------------
        System.out.println("\nSquare of Even Numbers:");
        list.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .forEach(i -> System.out.println(i));  // Lambda

        // Same using Method Reference
        System.out.println("\nSquare of Even Numbers (Method Reference):");
        list.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * i)
                .forEach(System.out::println);

        // ---------------------------------------------------
        // 6️⃣ distinct() → remove duplicates
        // ---------------------------------------------------
        List<Integer> dupList = Arrays.asList(10, 20, 20, 30, 30, 40);

        System.out.println("\nDistinct Values:");
        dupList.stream()
                .distinct()
                .forEach(System.out::println);

        // ---------------------------------------------------
        // 7️⃣ limit(n) → take first n elements
        // ---------------------------------------------------
        System.out.println("\nFirst 3 elements:");
        list.stream()
                .limit(3)
                .forEach(System.out::println);

        // ---------------------------------------------------
        // 8️⃣ skip(n) → skip first n elements
        // ---------------------------------------------------
        System.out.println("\nAfter skipping first 3 elements:");
        list.stream()
                .skip(3)
                .forEach(System.out::println);

        // Final check — original list never changes
        System.out.println("\nFinal List (unchanged): " + list);
    }
}
