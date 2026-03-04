import java.util.List;
import java.util.stream.Collectors;

public class ListSpecialCharacter {

    public static void main(String[] args) {

        String input = "Hello Wol=rld? 2@#";

        List<Character> charlist = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> Character.isLetterOrDigit(c))
                .collect(Collectors.toList());

        System.out.println(charlist);

        List<Character> specialcharlist = input.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !Character.isLetterOrDigit(c))
                .collect(Collectors.toList());

        System.out.println(specialcharlist);

    }
}
