import org.junit.Test;
import objects.Doctor;
import objects.Persona;
import objects.Teacher;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest {

    @Test
    public void sortExample() {
        List<Integer> integerList = Arrays.asList(5, 2, 65, 48 - 4, 400, 3);
        List<String> stringList = Arrays.asList("z", "a", "b", "A", "AB", "c", "w", "Z");

        Collections.sort(integerList);
        Collections.sort(stringList);

        System.out.println(integerList);
        System.out.println(stringList);
    }

    @Test
    public void reverseExample() {
        List<Integer> integerList = Arrays.asList(5, 2, 65, 48 - 4, 400, 3);
        List<String> stringList = Arrays.asList("z", "a", "b", "A", "AB", "c", "w", "Z");

        Collections.reverse(integerList);
        Collections.reverse(stringList);

        System.out.println(integerList);
        System.out.println(stringList);
    }

    @Test
    public void mergingTheExamples() {
        List<Integer> integerList = Arrays.asList(5, 2, 65, 48 - 4, 400, 3);
        List<String> stringList = Arrays.asList("z", "a", "b", "A", "AB", "c", "w", "Z");

        Collections.sort(integerList);
        Collections.sort(stringList);
        Collections.reverse(integerList);
        Collections.reverse(stringList);

        System.out.println(integerList);
        System.out.println(stringList);
    }


    @Test
    public void comparableWithPersonClass() {
        List<Persona> people = Arrays.asList(
                new Persona("Ximena", "Aguilar", 50),
                new Persona("Ximena", "Aguilar", 30),
                new Persona("Ximena", "Aguilar", 40),
                new Persona("Ximena", "Mendoza", 40),
                new Persona("A", "A", 24),
                new Persona("A", "A", 5),
                new Persona("A", "B", 12),
                new Persona("Angel", "Aguilar", 20),
                new Persona("Angelica", "Aguilar", 30),
                new Persona("Sebastian", "Castro", 30),
                new Persona("Sebastian", "Aguilar", 30),
                new Persona("Angel", "Aguilar", 31),
                new Doctor("Catalina", "Lopez", 15),
                new Teacher("Bruno", "Aguilar", 30),
                new Teacher("Bruno", "Aguilar", 31),
                new Teacher("Bruno", "Castrp", 31),
                new Persona("Angelica", "Aguilar", 30));

        Collections.sort(people);
        people.forEach(System.out::println);
//        System.out.println("---------------------------------------------------------------");
//        Collections.reverse(people);
//        people.forEach(System.out::println);

    }
}
