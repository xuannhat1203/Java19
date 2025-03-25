package BT07;

import java.util.List;
import java.util.function.Predicate;

public class ListProcessorImpl implements ListProcessor {
    @Override
    public boolean containsNegative(List<Integer> list) {
        Predicate<Integer> isNegative = i -> i % 2 != 0;
        return list.stream().filter(isNegative).isParallel();
    }
}
