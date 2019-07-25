package daniel.com;

import java.util.*;


public class StudentRepo implements IStudent {

    List<Student> studentList = new ArrayList<>();

    @Override
    public void add(Student student) throws ValidationException {

        if (student.getDateOfBirth() < 1900 || student.getDateOfBirth() > (2019 - 18)) {
            throw new ValidationException("Age is invalid", "Error");
        } else if (student.getFirstName().isEmpty() || student.getLastName().isEmpty()) {
            throw new ValidationException("Last name  or first name is empty", "Error");
        } else if (student.getGender().toUpperCase() != "M" && student.getGender().toUpperCase()!="F"){
            throw new ValidationException("Case ignored", "Error");
        }
        studentList.add(student);
    }

    @Override
    public void delete(long cnp) throws ValidationException {
        Student toRemove = null;
        for(Student student : studentList){
            if(student.getCnp() == cnp){
                toRemove = student;

            }
        }
        if ( toRemove == null){
            throw new ValidationException("Cnp was empty", "Error");
        }
        studentList.remove(toRemove);
    }


    @Override
    public void listAge(int age) throws ValidationException{
        if ( age < 0 ){
            throw new ValidationException("Age is negative", "Error");
        }
        for (Student student : studentList){
            if (2019 - student.getDateOfBirth() == age){
                System.out.println(student);
            }
        }
    }

    @Override
    public void listByAge() throws ValidationException{

        Collections.sort(studentList);

        for (Student student : studentList){
            System.out.println(student);
        }

    }
}
