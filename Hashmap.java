import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Hashmap {
    public static void main(String args[]) {
        Map<String, Map<String, List<String>>> state = new HashMap<>();

        Map<String, List<String>> city = new HashMap<>();

        city.put("mh", Arrays.asList("pune", "nagar", "nashik"));
        city.put("kr", Arrays.asList("banglore", "hampi", "zya"));

        state.put("India", city);

        List<String> getCity = state.get("India").get("mh");
        System.out.println(getCity);

    }
}