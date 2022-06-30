package class5;

public class Person {

    //1. Data members
    String firstname;
    String lastname;
    int yearOfBirth;

    //2. Constructors
    Person() { // Default constructor
        firstname = "not specified";
        lastname = "not specified";
        yearOfBirth = 99999;
    }

    Person(String firstname, String lastname, int yearOfBirth) { // Constructor
        this.firstname = firstname;
        this.lastname = lastname;
        this.yearOfBirth = yearOfBirth;
    }

    Person(String firstname, int yearOfBirth) {
        this.firstname = firstname;
        lastname = "not specified";
        this.yearOfBirth = yearOfBirth;
    }

    //3. Methods

}
