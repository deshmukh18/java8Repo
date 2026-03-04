import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountMFEmployee {

    private int id;
    private String name;
    private int age;
    private String gender;
    private double salary;

    public CountMFEmployee(int id, String name, int age, String gender, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "CountMFEmployee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", salary="
                + salary + "]";
    }

    public static void main(String[] args) {
        List<CountMFEmployee> employees = Arrays.asList(new CountMFEmployee(1, "Amruta", 30, "Female", 200000),
                new CountMFEmployee(2, "Omkar", 20, "Male", 2300000),
                new CountMFEmployee(3, "Sneh", 24, "Male", 2900000),
                new CountMFEmployee(4, "neha", 21, "Female", 2800000));

        // System.out.println(employees);
        // lambda expression
        employees.forEach(emp -> System.out.println(emp));

        // Method Reference
        // employees.forEach(System.out::println);

        Map<String, Long> countemp = employees.stream()
                .collect(Collectors.groupingBy(CountMFEmployee::getGender, Collectors.counting()));

        Map<String, Double> avgsalary = employees.stream()
                .collect(Collectors.groupingBy(CountMFEmployee::getGender,
                        Collectors.averagingDouble(CountMFEmployee::getSalary)));

        System.out.println(countemp);
        System.out.println(avgsalary);

        double avdSal = employees.stream()
                .collect(Collectors.averagingDouble(CountMFEmployee::getSalary));

        System.out.println(avdSal);

    }

}
