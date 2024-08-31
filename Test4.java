package StreamAPI;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test4 {
    public static void main(String[] args) {
        ArrayList<String > list = new ArrayList<>();
        list.add("Amit");
        list.add("Raj");
        list.add("Vishal");
        list.add("Jyes");

        Stream<String> s = list.stream();
//        s.sorted().forEach(e-> System.out.println(e));

        s.forEach(e-> System.out.println(e.charAt(0)));


    }
}
