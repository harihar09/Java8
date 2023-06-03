package FunctionalInterface.commonFiles;

import java.util.Comparator;

public class EmployeeModel implements Comparator<EmployeeModel> {


    private String name;
    private String department;
    private  int salary;

    public EmployeeModel(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "FunctionalInterface.commonFiles.EmployeeModel{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }


    @Override
    public int compare(EmployeeModel o1, EmployeeModel o2) {
        return (o1.getSalary() - o2.getSalary());
    }


}
