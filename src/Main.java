//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;
//import java.util.Map;
//import java.util.stream.Collectors;
//
//public class Main {
//
//    public static void main(String[] args) {
//
//        List<Employee> emp= Arrays.asList(new Employee(1,"ankit",26,50000.00),
//                new Employee(2,"raju",28,6700.00),
//                 new Employee(3,"anamika",27,80000.00),
//                new Employee(4,"amar",29,50000.00),
//                new Employee(5,"ahmed",27,130000.00)
//        );
//        Map<Integer,Employee> mpemp=emp.stream().filter(e->e.getSalary()<10000)
//                .collect(Collectors.toMap(Employee::getId,e->e));
//        mpemp.forEach((id,employee)->System.out.println(id+" "+employee));
//
//    }
//}
