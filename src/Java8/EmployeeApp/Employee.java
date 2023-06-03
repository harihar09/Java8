package Java8.EmployeeApp;


public class Employee implements Comparable{
    private int id;
    private String name;
    private String department;
    private long salary;

    public Employee(int id, String name, String department, long salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        int count =0;
        Employee e = (Employee) o;
        count =  e.getDepartment().compareTo(this.getDepartment());
        if (count ==0){
           count= this.getName().compareTo(e.getName());
        }
        if(count == 0)
            count = Long.toString(this.getSalary()).compareTo(Long.toString(e.getSalary()));
        return  count;
    }
}
