package daniel.com;

import java.util.Objects;

public class Student extends StudentRepo implements Comparable {

    private String firstName;
    private String lastName;
    private int dateOfBirth;
    private String gender;
    private long cnp;



    public Student(String firstName, String lastName, int dateOfBirth, String gender, long cnp) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.cnp = cnp;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getCnp() {
        return cnp;
    }

    public void setCnp(long cnp) {
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", Gender=" + gender +
                ", cnp=" + cnp +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        int compareAge =((Student)o).getDateOfBirth();
        return this.getDateOfBirth() - compareAge;
    }
}
