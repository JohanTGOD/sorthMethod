package generics;

import java.util.Arrays;

public class GenericMethod {

    public static <T> void printInformation(T anything) {
        System.out.println(anything);
    }

    public static <R> void printALotOfInformation(R... anything) {
        Arrays.stream(anything).forEach(System.out::println);
    }
}
