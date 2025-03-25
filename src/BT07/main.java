package BT07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16));
        ListProcessor processor = new ListProcessorImpl();
        System.out.println(processor.containsNegative(list)?"Danh sách không chứa số âm":"Danh sách chứa số âm");
    }
}
