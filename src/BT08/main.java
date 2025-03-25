package BT08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ListProcessor processor = new ListProcessorImpl();
        System.out.println(processor.sumOddNumbers(list));
        System.out.println("Danh sách số lẻ:");
        ListProcessor.printList(list.stream().filter(num -> num % 2 != 0).toList());
    }
}
