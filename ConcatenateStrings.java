import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenateStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Cherry", "Kiwi");

        String result = strings.stream()
                .collect((Collectors.joining(", ")));

        System.out.println(result);

        System.out.println("result is " +result);

    }
}
