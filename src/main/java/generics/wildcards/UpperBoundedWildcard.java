package generics.wildcards;

public class UpperBoundedWildcard<T extends Number> {

    T myFirstGeneric;

    public UpperBoundedWildcard(T anyArgument) {
        this.myFirstGeneric = anyArgument;
    }

    public void printInformation() {
        System.out.println(myFirstGeneric.doubleValue()*4);
    }
}
