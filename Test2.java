package StreamAPI;

import java.util.ArrayList;
public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.stream().filter(e->e%2==0).forEach(e-> System.out.println(e));

    }
}