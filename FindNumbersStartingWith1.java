import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindNumbersStartingWith1 {
    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 45, 12, 123, 456, 11);

        List<Integer> result = intList.stream()
                .filter(num -> Integer.toString(num).startsWith("1"))
                .collect(Collectors.toList());

        System.out.println(result);

    }
}
