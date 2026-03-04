import java.util.stream.Collectors;

public class RemoveCharacterFromString {
    public static void main(String[] args) {

        String str = "Java Interview";
        char ch = 'a';

        String result = removeCharacter(str, ch);
        System.out.println(str);

        System.out.println("after removing character: " + result);

    }

    public static String removeCharacter(String str, char ch) {
        if (str == null || str.isEmpty())

        {
            return str;
        }

        String result = str.chars()
                .filter(c -> c != ch)
                .mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.joining());

        return result;

    }
}
