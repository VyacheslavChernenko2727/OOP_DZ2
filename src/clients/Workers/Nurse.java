package clients.Workers;

import clients.Animal;

import java.time.LocalDate;

public class Nurse extends Workers{
    public Nurse(String name, LocalDate age, LocalDate EmploymentDate, double salary) {
        super(name, age, EmploymentDate, salary);
    }
    @Override
    public void toWork() {
    }
    public void Bandage(Animal animal){
        System.out.println(animal.getType() + " " + animal.getName() + " был перевязан " + name);
    }
    public void helpDoc(){
        System.out.println(name + " поддержала доктора");
    }
}
