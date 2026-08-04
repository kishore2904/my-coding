package clientInterview;

public class Employee implements Comparable<Employee>{

    private int age;
    private String name;
    private double salary;

    private String department;


    public Employee(int age, String name, double salary, String department){
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }


    @Override
    public int compareTo(Employee o) {
        return Double.compare(this.salary, o.salary);
    }
}
