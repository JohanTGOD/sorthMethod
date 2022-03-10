import generics.GenericGeneralExample;
import generics.GenericClassProblem;
import generics.GenericClassProblemSolved;
import generics.GenericMethod;
import org.junit.Test;
import person.Doctor;
import person.Persona;
import person.Teacher;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GenericTest {

    @Test
    public void checkingTheProblem() {
        GenericClassProblem genericProblem = new GenericClassProblem();
        genericProblem.printInteger(12);
        genericProblem.printBoolean(true);
        genericProblem.printString("Hi");
        genericProblem.printPersona(new Doctor("Juan", "Ramirez", 28));
    }

    @Test
    public void resolvingTheProblem() {
//        GenericClassProblemSolved withInteger = new GenericClassProblemSolved(13);
//        GenericClassProblemSolved withBoolean = new GenericClassProblemSolved(true);
//        GenericClassProblemSolved withString = new GenericClassProblemSolved("Hi");
//        GenericClassProblemSolved withDoctor = new GenericClassProblemSolved(new Doctor("Juan", "Ramirez", 28));
//
//        withInteger.printInformation();
//        withBoolean.printInformation();
//        withString.printInformation();
//        withDoctor.printInformation();

        new GenericClassProblemSolved<>(12).printInformation();
        new GenericClassProblemSolved(true).printInformation();
        new GenericClassProblemSolved("Hi").printInformation();
        new GenericClassProblemSolved(new Doctor("Juan","Ramirez",28)).printInformation();
    }

    @Test
    public void anotherExample() {
        GenericGeneralExample test1 = new GenericGeneralExample(Integer.class);
        GenericGeneralExample test2 = new GenericGeneralExample(String.class);
        GenericGeneralExample test3 = new GenericGeneralExample(Boolean.class);
        GenericGeneralExample test4 = new GenericGeneralExample(Integer.class);
        GenericGeneralExample test5 = new GenericGeneralExample(Float.class);
        GenericGeneralExample test6 = new GenericGeneralExample(Object.class);

        test1.printInformation();
        test2.printInformation();
        test3.printInformation();
        test4.printInformation();
        test5.printInformation();
        test6.printInformation();
    }

    @Test
    public void methodExamples() {
        GenericMethod.printInformation(44);
        GenericMethod.printInformation(true);
        GenericMethod.printInformation("hi");
        GenericMethod.printInformation(new Teacher("Profe", "Aguilar", 30));
//        System.out.println("//---------------------------//");
//        GenericMethod.printALotOfInformation(13, false, "hello", 12, 8, 20, "bye", true, 'c');
//        GenericMethod.printALotOfInformation(23);
    }

    @Test
    public void betterUse() {
        List<String> messages = Arrays.asList("hello", "how", "are", "you");
        List<Integer> ages = Arrays.asList(60, 30, 100, 5);
        List<Persona> people = Arrays.asList(new Teacher("Profe", "Aguilar", 30),
                new Doctor("Doc", "Gomez", 50));
//        List<Integer> ages2 = Arrays.asList(60, "hello", 100, 5);
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Juan");
        students.put(2, "Diana");

    }
}
