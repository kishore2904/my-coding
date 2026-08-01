package clientInterview;

import java.util.List;

public class Department {
    private String departmentName;

    List<Employee> employeeList;

    public Department(String departmentName, List<Employee> employeeList){
        this.employeeList = employeeList;
        this.departmentName = departmentName;
    }

    public List<Employee> getEmployeeList(){
        return employeeList;
    }

    public  String getDepartmentName(){
        return departmentName;
    }

    public List<Employee> setEmployeeList(List<Employee> employeeList){
        this.employeeList = employeeList;
        return  employeeList;
    }

    public String setDepartmentName(String departmentName){
        this.departmentName = departmentName;

        return departmentName;
    }

}
