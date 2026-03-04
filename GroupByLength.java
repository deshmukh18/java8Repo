
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {

    public static void main(String[] args) {

        List<String> words = List.of("Amruta", "Nikita", "MAyuri", "omkar", "rutu");

        Map<Integer, Long> result = words.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.counting()));

        System.out.println(result);

    }
}
