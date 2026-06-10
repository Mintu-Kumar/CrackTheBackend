package FindFirstNonRepeatedCharInString;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstNonRepeatedCharInString {

    public static void main(String[] args) {
        String input = "Crack The Backend".replaceAll("\\s+","").toLowerCase();

        Map<String,Long> map = Arrays.stream(input.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        String ch =  map.entrySet().stream()
                .filter(entry->entry.getValue()==1)
                .map(entry->entry.getKey())
                .findFirst()
                .get();

        System.out.println("First non repeated char is :"+ ch);
    }
}
