package clientInterview;

import java.util.*;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String args[]) {
        List<Integer> numbers = List.of(5, 1, 1, 5, 8, 7, 9, 2, 5, 7);
        List<Employee> employeeList = Arrays.asList(
                new Employee(25, "Aahn", 50000, "ECE"),
                new Employee(30, "Alice", 50000,"MECH"),
                new Employee(28, "Bob", 55000,"CSE"),
                new Employee(44, "kumar", 45000,"EEE"),
                new Employee(29, "David", 62000,"CSE"),
                new Employee(31, "Eva", 70000,"MECH"),
                new Employee(26, "Frank", 52000,"ECE"),
                new Employee(35, "Grace", 85000,"EEE"),
                new Employee(27, "Henry", 58000,"CSE"),
                new Employee(32, "Ivy", 75000,"MECH"),
                new Employee(23, "Jack", 45000,"ECE"),
                new Employee(34, "Karen", 90000,"MECH"),
                new Employee(28, "Leo", 61000,"CSE"),
                new Employee(30, "Mia", 67000,"MECH"),
                new Employee(33, "Nathan", 78000,"CSE"),
                new Employee(26, "Olivia", 53000,"ECE"),
                new Employee(29, "Peter", 60000,"CSE"),
                new Employee(31, "Quinn", 72000,"MECH"),
                new Employee(27, "Rachel", 56000,"CSE"),
                new Employee(36, "Sam", 95000,"EEE"),
                new Employee(25, "Tina", 51000,"IT"),
                new Employee(32, "Uma", 74000,"CIVIl"),
                new Employee(28, "Victor", 59000,"FOOD"),
                new Employee(34, "Wendy", 88000,"EEE")
        );


        Department development = new Department(
                "Development",
                Arrays.asList(
                        new Employee(25, "John", 60000, "Development"),
                        new Employee(30, "David", 80000, "Development")
                )
        );

        Department testing = new Department(
                "Testing",
                Arrays.asList(
                        new Employee(27, "Alice", 50000, "Testing"),
                        new Employee(32, "Bob", 70000, "Testing")
                )
        );

        Department hr = new Department(
                "HR",
                Arrays.asList(
                        new Employee(29, "Emma", 55000, "HR"),
                        new Employee(35, "Sophia", 90000, "HR")
                )
        );

        List<Department> departments =
                Arrays.asList(development, testing, hr);
//        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName)).forEach(employee -> System.out.println(employee.getName() + " - " + employee.getSalary()));
//
//        employeeList.sort((emp1,emp2)->{
//            int salaryCompare = Double.compare(emp1.getSalary(), emp2.getSalary());
//            if(salaryCompare == 0){
//                return Integer.compare(emp1.getAge(), emp2.getAge());
//            }
//            return salaryCompare;
//        });
//
//
//
//
//        Set<Integer> unique = new HashSet<>();
//        Set<Integer> collect = numbers.stream().filter(num -> !unique.add(num)).collect(Collectors.toSet());
//
//        System.out.println("Duplicate numbers: " + collect);
//
//
//        numbers.stream()
//                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
//                        .entrySet().stream().filter(x-> x.getValue() !=1)
//                .forEach(x-> System.out.println("duplicate number: " + x.getKey() +" Count: "+ x.getValue()));

//        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(10)
//                .forEach(employee -> System.out.println(employee.getName() + " - " + employee.getSalary()));

//        Map<Double, List<Employee>> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getSalary));
//        collect.forEach((salary, employees) -> {
//            System.out.println("Salary: " + salary);
//            employees.forEach(employee -> System.out.println(" - " + employee.getName() + ", Age: " + employee.getAge()));
//        });

//        employeeList.stream().collect(Collectors.partitioningBy(employee-> employee.getSalary()>=60000))
//                .forEach((isHigher,employee)->{
//                    System.out.println((isHigher ? "Employees with salary greater than 60000:" : "Employees with salary less than or equal to 60000:"));
//                    employee.stream().sorted(Comparator.comparing(Employee::getName)).forEach(emp-> System.out.println(emp.getName() + " - " + emp.getSalary()));
//                });

//        employeeList.stream()
//                .sorted(Comparator.comparing(Employee::getSalary).reversed())
//                .limit(3)
//                .forEach(employee-> System.out.println(employee.getName() + " - " + employee.getSalary()));
//

//        boolean kumar = employeeList.stream().anyMatch(employee -> employee.getName().equalsIgnoreCase("kumar") && employee.getAge() > 40);
//
//        employeeList.stream().filter(employee -> employee.getName().equalsIgnoreCase("kumar") && employee.getAge() > 40).forEach(employee -> System.out.println(employee.getName() + " age - " + employee.getAge() + " Salary - " + employee.getSalary()));

//        employeeList.stream()
//                .filter(employee -> employee.getSalary()>50000)
//                .collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()))
//                .entrySet()
//                .stream()
//                .filter(employeeMap-> employeeMap.getValue() >1)
//                .forEach(employeeMap-> System.out.println("Department: " + employeeMap.getKey() + " Count: " + employeeMap.getValue() ));


//        employeeList.stream()
//                .filter(employee -> employee.getSalary() == 45000)
//                .forEach(employee-> System.out.println("Employee with salary 45000: " + employee.getName()));

//        employeeList.stream().collect(Collectors.partitioningBy(employee -> employee.getSalary()>=50000))
//                .entrySet().stream().forEach(employeeMap->{
//                    System.out.println("Employee with salary greater than 50000: "+employeeMap.getKey());
//                    employeeMap.getValue().stream().forEach(employee -> System.out.println(employee.getName()));
//                });


//        departments.stream().flatMap(department -> department.employeeList.stream()).map(Employee::getAge).forEach(System.out::println);

//        departments.stream().flatMap(department -> department.getEmployeeList().stream()
//                .map(employee -> employee.getName() + " - " + department.getDepartmentName()))
//                .forEach(System.out::println);

//        departments.stream().collect(Collectors.groupingBy(Department::getDepartmentName,
//                        Collectors.flatMapping(department -> department.getEmployeeList().stream().map(Employee::getName), Collectors.toList())))
//                .forEach((departmentName, employeeNames) -> {
//                    System.out.println("Department: " + departmentName);
//                    employeeNames.forEach(employeeName -> System.out.println(" - " + employeeName));
//                });
    }
}
