import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String input = "iinddiiaa";

        Optional<Character> result = findFirstNonRepeatingchar(input);

        result.ifPresentOrElse(c -> System.out.println("first non repeating character is: " + c),
                () -> System.out.println("No repeting character found"));
    }

    private static Optional<Character> findFirstNonRepeatingchar(String s) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count the Frequency of each Character
        s.chars().mapToObj(c -> (char) c)
                .forEach(c -> charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1));

        // Find the first character with a frequency of 1
        // return charCountMap.entrySet().stream()

        // .filter(entry -> entry.getValue() == 1)

        // .map(Map.Entry::getKey)

        // .findFirst();

        return charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();


                
    }
}
