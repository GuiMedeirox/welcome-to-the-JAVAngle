import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>(List.of(
            new Employee("John", "Smith", "14/02/1985"),
            new Employee("Emily", "Johnson", "23/05/1990"),
            new Employee("Michael", "Williams", "30/09/1978"),
            new Employee("Sarah", "Brown", "05/11/1992"),
            new Employee("David", "Jones", "17/01/1983"),
            new Employee("Laura", "Garcia", "21/03/1987"),
            new Employee("Robert", "Miller", "11/07/1995"),
            new Employee("Jessica", "Davis", "25/08/1989"),
            new Employee("Daniel", "Martinez", "03/12/1982")
        ));

        employees.forEach((e) -> System.out.println(e));
        System.out.println("------------------------------------------");
        //Employee.detailedInformations(employees);



    }
}
