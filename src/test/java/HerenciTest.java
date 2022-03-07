import org.junit.Test;
import person.Doctor;
import person.Persona;
import person.Teacher;


public class HerenciTest {

    @Test
    public void personTest() {
        Persona persona = new Persona();
        Persona persona1 = new Persona("JuanPersona", "PersonaLastName", 20);

        System.out.println("The name is : " + persona1.getName());
        System.out.println("The name is : " + persona1.getLastName());
    }

    @Test
    public void doctorTest() {
        Doctor doctor1 = new Doctor("JuanMedico", "MedicoLastName", 21);
        System.out.println("The name is : " + doctor1.getName());
        System.out.println("The age is : " + doctor1.getAge());
        System.out.println("The age is : " + doctor1.returnAge());

    }

    @Test
    public void teacherTest() {
        Teacher teacher = new Teacher("JuanTeacher", "TeacherLastName", 22);
        System.out.println(teacher.getLastName());

    }
}