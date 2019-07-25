package daniel.com;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static Logger LOGGER = Logger.getLogger(Main.class.getName());

    private static StudentRepo studentrepository = new StudentRepo();

    public static void main(String[] args) throws ValidationException{

        LOGGER.log(Level.INFO, "error");

        Student student1 = new Student("Dani", "Pop", 1995, "M", 1950327330);
        Student student2 = new Student("Corvin", "Popescu", 1940, "M",1953740267 );
        Student student3 = new Student("Romeo", "Ciobanu", 1956, "M", 1945834855);
        Student student4 = new Student("Adi", "Florentin", 1967, "M", 1954334256);
        Student student5 = new Student("Bogdan", "Marinescu", 1974, "M",1955435347 );
        Student student6 = new Student("Ionut", "Luta", 1987, "M", 1946565477);

        studentrepository.add(student1);
        studentrepository.add(student2);
        studentrepository.add(student3);
        studentrepository.add(student4);
        studentrepository.add(student5);
        studentrepository.add(student6);

        studentrepository.delete(1950327330);

        studentrepository.listAge(79);

        studentrepository.listByAge();


    }
}
