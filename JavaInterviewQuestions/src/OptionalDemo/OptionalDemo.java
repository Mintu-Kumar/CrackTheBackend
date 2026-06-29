package OptionalDemo;

import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {
        Employee employee = new Employee(101, null); // email is null

        // Wrap employee in Optional
        Optional<Employee> optionalEmployee = Optional.ofNullable(employee);

        // Safe handling with map + ifPresent
        optionalEmployee
                .map(Employee::getEmail)       // safely extract email if employee is not null
                .ifPresent(System.out::println); // print only if email is not null
    }

}

class Employee {
    private final int id;
    private final String email;

    public Employee(int id, String email) {
        this.id = id;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}

