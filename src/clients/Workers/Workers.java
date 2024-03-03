package clients.Workers;

import java.time.LocalDate;

public abstract class Workers {
    protected String name;
    protected LocalDate age;
    protected LocalDate EmploymentDate;
    public double salary;
    public Workers(String name, LocalDate age, LocalDate EmploymentDate, double salary){
        this.name = name;
        this.age = age;
        this.EmploymentDate = EmploymentDate;
        this.salary = salary;
    }
    public abstract void toWork();
    public String getName(){
        return name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
}
