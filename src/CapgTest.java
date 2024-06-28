//Find the highest salary of an employee from the HR
//department using Java stream API.

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class CapgTest {

    public static void main(String[] args) {
        List<Employee> emplist= Arrays.asList(new Employee(101,"Ankit",34,400000.00,"HR")
                ,new Employee(102,"Rajesh",29,200003.00,"IT"),
                        new Employee(103,"Kavita",34,600000.00,"Finance"),
                                new Employee(104,"Nilesh",26,320000.00,"HR"));


     Optional<Employee> highestSalary=  emplist.stream()
                .filter(e->"HR".equals(e.getDepartment()))
                 .max((e1,e2)->Double.compare(e1.getSalary(),e2.getSalary()));
        highestSalary.ifPresent(e->System.out.println("Highest Salary"+e));

    }

}
