package bean;

public class Employee {
    int index;
    String name;
    Double salary;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Employee(int index, String name, double salary) {
        this.index = index;
        this.name = name;
        this.salary = salary;
    }

    public void salaryIncrement(Double increment) {
        this.salary = this.salary + increment;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "index=" + index +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}