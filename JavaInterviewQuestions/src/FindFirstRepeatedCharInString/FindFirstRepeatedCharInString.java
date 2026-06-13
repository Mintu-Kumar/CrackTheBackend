package FindFirstRepeatedCharInString;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFirstRepeatedCharInString {

    public static void main(String[] args) {

        String input = "Crack The Backend".replaceAll("\\s+","").toLowerCase();
        //output  =c
      Map<String,Long> map=    Arrays.stream( input.split(""))
                  .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
      //  System.out.println(map);

       String st=  map.entrySet().stream()
                 .filter(entry->entry.getValue()>1)
                 .map(entry->entry.getKey())
                 .findFirst()
                 .get();

        System.out.println("First repeated char in string is:" +st);



    }
}
