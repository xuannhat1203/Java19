package BT05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("Alice", "Andrew", "Bob", "Anna", "Charles"));
        int count = 0;
        for (String s : list) {
            if (s.charAt(0) == 'A' && s.length() >= 5) {
                count++;
            }
        }
        System.out.println(count);
    }
}
