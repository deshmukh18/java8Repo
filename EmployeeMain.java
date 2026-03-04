import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeMain {
    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(new Employee("Amruta", 3000000),
                new Employee("omkar", 4500000),
                new Employee("Nidhish", 1200000),
                new Employee("Suvrna", 220000));

        Optional<Employee> highestPaidEmployee = employees.stream()
                .max(Comparator.comparingDouble(Employee::getSalary));

        highestPaidEmployee.ifPresent(employee -> System.out.println("Employee with highest paid salary" + employee));

    }
}
