package generics;

public class GenericGeneralExample<J> {

    private J classObject;

    public GenericGeneralExample(J argumentObject) {
        this.classObject = argumentObject;
    }

    public void printInformation() {
        System.out.println(classObject);
    }
}
