package BT07;

import java.util.List;
import java.util.function.Predicate;

public class ListProcessorImpl implements ListProcessor {
    @Override
    public boolean containsNegative(List<Integer> list) {
        for (Integer num : list) {
            if (num < 0) {
                return true;
            }
        }
        return false;
    }
}
