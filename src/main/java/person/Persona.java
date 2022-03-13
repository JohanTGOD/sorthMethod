package person;

public class Persona implements Comparable<Persona> {

    private String name;
    private String lastName;
    private int age;

    public Persona(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Persona(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Persona personToCompareWith) {
        if (personToCompareWith.age == this.age) {
            return personToCompareWith.name.compareTo(this.name) + personToCompareWith.getLastName().compareTo(this.lastName);
        }
        return 1;
    }

    public String toString() {
        return "Hola soy: "+getName()+" "+ getLastName()+
                " y tengo: "+getAge();
    }
}
