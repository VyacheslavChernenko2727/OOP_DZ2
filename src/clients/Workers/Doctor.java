package clients.Workers;

import clients.Animal;
import clients.Workers.Workers;

import java.time.LocalDate;

public class Doctor extends Workers {
    private Workers worker;
    public Doctor(String name, LocalDate age, LocalDate EmploymentDate, double salary) {
        super(name, age, EmploymentDate, salary);
    }
    @Override
    public void toWork() {
    }
    public void doHeal(Animal animal){
        System.out.println("доктор вылечил " + animal.getType() + " " + animal.getName());
    }
    public void doInspection(){
        System.out.println("доктор провел осмотр");
    }
}
