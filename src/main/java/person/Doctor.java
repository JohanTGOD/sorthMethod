package person;

public class Doctor extends Persona
{
    private int yearsOfExperience;

    public Doctor(String name, String lastName, int age) {
        super(name, lastName, age);
    }

    public Doctor(){

    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    public int returnAge() {
        return super.getAge();
    }
}
