package generics;

public class GenericClassProblemSolved<T> {

    T myFirstGeneric;

    public GenericClassProblemSolved(T anyArgument) {
        this.myFirstGeneric = anyArgument;
    }

    public void printInformation() {
        System.out.println(myFirstGeneric);
    }
}
