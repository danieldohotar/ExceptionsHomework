package daniel.com;

public interface IStudent {

    void add(Student student) throws ValidationException;

    void delete(long cnp) throws  ValidationException;

    void listAge(int age) throws ValidationException;

    void listByAge() throws ValidationException;

}
