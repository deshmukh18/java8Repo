import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddEvenAddition {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        Map<Boolean, Integer> result = list.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0, Collectors.summingInt(Integer::intValue)));

        int evensum = result.get(true);
        int oddsum = result.get(false);

        System.out.println(evensum + "****" + oddsum);
    }
}
