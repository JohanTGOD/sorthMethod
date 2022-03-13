import org.junit.Test;
import person.Doctor;
import person.Persona;
import person.Teacher;

public class ComparableTest {

    @Test
    public void comparableWithIntegerExample() {
        Integer firstValue = 222;
        Integer secondValue = 986;

        System.out.println(firstValue.compareTo(secondValue));
        System.out.println(firstValue.compareTo(222));
    }

    @Test
    public void comparableWithStringExample() {
        String firstValue = "hola";
        String secondValue = "adios";

        System.out.println(firstValue.compareTo(secondValue));
        System.out.println(firstValue.compareTo("Hola"));
        System.out.println(firstValue.compareTo("hola"));
    }

    @Test
    public void comparableWithPersonClass() {
        Persona persona = new Persona("Angel", "Aguilar", 30);
        Persona persona2 = new Persona("Angel", "Aguilar", 30);
        Persona persona3 = new Persona("Angelica", "Aguilar", 30);
        Persona persona4 = new Persona("Angel", "Aguilar", 31);

        System.out.println(persona.compareTo(persona2));
        System.out.println(persona.compareTo(persona3));
        System.out.println(persona.compareTo(persona4));

        //-------------------------------------------------------------------------
        System.out.println("**********************************************");
        Persona doctor = new Doctor("Catalina", "Lopez", 30);
        Doctor doctor1 = new Doctor("Catalina", "Lopez", 30);
        Teacher teacher = new Teacher("Bruno", "Aguilar", 30);
        Teacher teacher2 = new Teacher("Bruno", "Aguilar", 31);
        System.out.println(persona.compareTo(doctor));
        System.out.println(doctor.compareTo(doctor1));
        System.out.println(doctor1.compareTo(teacher));
        System.out.println(teacher.compareTo(teacher2));
    }
}
