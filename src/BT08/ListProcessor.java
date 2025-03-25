package BT08;

import java.util.List;
import java.util.function.Predicate;

public interface ListProcessor {
    abstract int sumOddNumbers(List<Integer> list);
    public static void printList(List<Integer> list) {
        list.forEach(System.out::println);
    }
    default boolean checkOdd(List<Integer> list){
        Predicate<Integer> isOdd = i -> i % 2 != 0;
        return list.stream().filter(isOdd).isParallel();
    }
}
