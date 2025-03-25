package BT06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(Arrays.asList("java","lambda", "stream", "functional"));
        StringProcessor processor = input -> input.toUpperCase() + "- TECHNICAL";
        List<String> processedStrings = new ArrayList<>();
        for (String s : list) {
            processedStrings.add(processor.processString(s));
        }
        processor.printList(processedStrings);
    }
}
