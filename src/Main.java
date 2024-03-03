import clients.Workers.Doctor;
import clients.Workers.Nurse;
import clients.impl.*;
import clients.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Doctor doc = new Doctor("Докто Хаус", LocalDate.of
                (1978, 4, 14), LocalDate.of
                (2018, 9, 27), 65000);
        Nurse nurse = new Nurse("Карла", LocalDate.of
                (1992, 3, 25), LocalDate.of
                (2023, 10, 3), 30000);
        Animal cat = new Cat("Степка", 5, LocalDate.now(), new Owner());
        Animal fish = new Fish("Немо", 1, LocalDate.now(), new Owner());
        Animal duck = new Duck("Мак", 2, LocalDate.now(), null);
        Animal eagle = new Eagle("Летун", 6, null, null);
        VeterinaryClinic clinic = new VeterinaryClinic("Ветеренарня клиника №1");
        clinic.addPersonell(doc);
        clinic.addPersonell(nurse);
        clinic.addAnimal(cat);
        nurse.Bandage(duck);
        System.out.println(clinic.getIllGoable());
        System.out.println(clinic.getSalary(nurse));
        System.out.println(clinic.getSalary(doc));
    }
}