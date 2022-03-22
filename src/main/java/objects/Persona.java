package objects;

public class Persona implements LivingBeing<Persona> {

    private String name;
    private String lastName;
    private Integer age;

    public Persona(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    public Persona() {

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

//    @Override
//    public int compareTo(Persona personToCompareWith) {
//        if (this.name.compareTo(personToCompareWith.getName()) == 0) {
//            if (this.lastName.compareTo(personToCompareWith.getLastName()) == 0) {
//                if (this.age.compareTo(personToCompareWith.getAge()) == 0) {
//                    return 0;
//                } else if (this.age.compareTo(personToCompareWith.age) > 0) {
//                    return 3;
//                } else {
//                    return -3;
//                }
//            } else if (this.lastName.compareTo(personToCompareWith.getLastName()) > 0) {
//                return 2;
//            } else {
//                return -2;
//            }
//        } else if (this.name.compareTo(personToCompareWith.getName()) > 0) {
//            return 1;
//        } else {
//            return -1;
//        }

        //El orden importa
//        return this.getAge() - personToCompareWith.getAge();
//    }

    public String toString() {
        return "Hola soy: " + getName() + " " + getLastName() +
                " y tengo: " + getAge();
    }

    @Override
    public int compareTo(Persona o) {
        return 0;
    }
}
