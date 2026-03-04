import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        String s = "aaabbbbcddd";

        Map<Character, Long> count = s.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()));

        count.forEach((character, frequency) -> System.out.println(character + " " + frequency));

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Amruta");
        map.put(2, "Omkar");
        map.put(3, "Sneh");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        for (Integer key : map.keySet()) {
            System.out.println(map.get(key));
        }

        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> entrys = itr.next();
            System.out.println(entrys.getKey() + "" + entrys.getValue());
        }

        map.forEach((key, value) -> System.out.println(key + " " + value));

        map.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + "" + entry.getValue()));
    }
}
