package class3;

public class Exercise2 {

    /**
     * Pass-by-object-reference will affect the original variable's value
     */

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.firstname = "Pepega";
        s1.setLastname("Bulldoge"); /* same as above */
        s1.credits = 142;
        s1.gpa = 3.8;

        resetAcademic(s1);
        System.out.println("Credits: "+s1.credits);
        System.out.println("GPA: "+s1.gpa);
    }


    public static void resetAcademic(Student student) {
        student.credits = 0;
        student.gpa = 0;

    }

}
