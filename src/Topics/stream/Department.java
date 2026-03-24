package Topics.stream;

import java.util.List;

public class Department {

    public String name;
    public List<Double> salaries;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Double> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Double> salaries) {
        this.salaries = salaries;
    }



    public Department(String name, List<Double> salaries) {
        this.name = name;
        this.salaries = salaries;
    }
}
