import java.util.Map;

public class State {

    public String stateName;

    public Map<String, City> cities;

    public State(String stateName, Map<String, City> cities) {
        this.stateName = stateName;
        this.cities = cities;
    }

    public void addCities(City city) {
        cities.put(stateName, city);
    }

}
