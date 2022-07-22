package Task_1;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Counter {
    public Map<String, Long> count(String[] s) {
        Map<String, Long> collect = Arrays.stream(s)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return collect
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (key, value) -> key, LinkedHashMap::new));

    }
}

