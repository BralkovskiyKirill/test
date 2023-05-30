package Zad2;

public class Employee
{
    String fullname;
    double salary;
    public Employee() {}
    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String toString()
    {
        return getFullname() + " " + getSalary();
    }
}
