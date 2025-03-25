package BT05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("Alice", "Andrew", "Bob", "Anna", "Charles"));
        long count = list.stream().filter(s -> s.startsWith("A") && s.length() >= 5).count();
        System.out.println(count);
    }
}
