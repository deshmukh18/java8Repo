public class Employee {
    private String name;
    private double salary;

    public String getName() {
        return name;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", salary=" + salary + "]";
    }

    public double getSalary() {
        return salary;
    }

}
