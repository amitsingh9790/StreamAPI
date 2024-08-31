package StreamAPI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // --- 1st way ---
        Stream<Integer> s1 = list.stream();
        s1.forEach(e-> System.out.println(e));

        // --- 2nd way ---
        Stream<Integer> s2 = Stream.of(100,200,300,400);
        s2.forEach(e-> System.out.println(e));

        // --- 3rd way ---
        Stream s3 = Stream.of("Amit","Rahul","Submit","Raj");
        s3.forEach(e-> System.out.println(e));

        // ---4th way ---
        int []arr = {100,200,300,400};
        IntStream s4 = Arrays.stream(arr);
        s4.forEach(e-> System.out.println(e));

        // ---5th way ---
        Stream s5 = Stream.empty();

        // ---6th way ---



    }
}
