import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class BT01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("Java", "", "Lambda", "Stream", "", "Functional"));
        Predicate<String> isEmpty = String::isEmpty;
        for (String str : list) {
            if (!isEmpty.test(str)) {
                System.out.println(str);
            }
        }
    }
}
