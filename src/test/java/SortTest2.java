import org.junit.Test;
import objects.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest2 {

    @Test
    public void example1() {

        Persona persona = new Persona("Juan", "Rodriguez", 30);
        Persona persona2 = new Persona("Juan2", "Rodriguez2", 32);
        Persona persona3 = new Persona("Juan3", "Rodriguez3", 33);

        Doctor doctor = new Doctor("DoctorName", "DoctorLastName", 25);
        Doctor doctor2 = new Doctor("DoctorName2", "DoctorLastName2", 27);
        Doctor docto3 = new Doctor("DoctorName3", "DoctorLastName", 28);

        Animal animal = new Animal();
        Animal animal2 = new Animal();
        Animal animal3 = new Animal();

        Teacher teacher = new Teacher("TeacherName", "TeacherLastName", 40);

        List<LivingBeing> livingBeings = Arrays.asList(persona, doctor, animal, teacher);
        Collections.sort(livingBeings);
        livingBeings.forEach(System.out::println);

//        List<LivingBeing> peoplelivingBeings = Arrays.asList(persona, persona2, persona3);
//        Collections.sort(peoplelivingBeings);

//        List<Persona> people = Arrays.asList(persona, persona2, persona3);
//        Collections.sort(people);

//        List<Persona> prefesionsList = Arrays.asList(persona, docto3, teacher);
//        Collections.sort(prefesionsList);
//        prefesionsList.forEach(System.out::println);
//
//        List<Animal> animalList = Arrays.asList(animal, animal2, animal3);
//        Collections.sort(animalList);

    }

}
