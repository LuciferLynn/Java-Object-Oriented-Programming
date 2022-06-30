package class5;

public class Exercise1_Person {

    public static void main(String[] args) {

        Person person1 = new Person();

        System.out.println(person1.firstname);
        System.out.println(person1.lastname);
        System.out.println(person1.yearOfBirth);

        person1.firstname = "Lynn";
        person1.lastname = "Thit";
        person1.yearOfBirth = 2003;

        System.out.println(person1.firstname);
        System.out.println(person1.lastname);
        System.out.println(person1.yearOfBirth);

        Person person2 = new Person("Jimmy","Jeff",2004);

        System.out.println(person2.firstname);
        System.out.println(person2.lastname);
        System.out.println(person2.yearOfBirth);

        Person person3 = new Person("Jeffy",2005);

        System.out.println(person3.firstname);
        System.out.println(person3.lastname);
        System.out.println(person3.yearOfBirth);
    }

}
