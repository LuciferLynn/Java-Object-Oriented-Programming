package class8;

public class PolymorphismDemo {

    public static void main(String[] args) {
        GraduateStudent g = new GraduateStudent();
        Student s = new Student();
        Person p = new Person();

        printSmth(g);
        printSmth(s);
        printSmth(p);

    }

    public static void printSmth(Person p) {
        System.out.println(p.toString());
    }


}

class Person extends Object{

    @Override
    public String toString() {
        return super.toString();
    }
}

class Student extends Person{

    @Override
    public String toString() {
        return super.toString();
    }
}

class GraduateStudent extends Student{
    @Override
    public String toString() {
        return super.toString();
    }
}

