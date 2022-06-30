package MQ3_6411271;

public class StudentTest {

    public static void main(String[] args) {
        Student undergraduate = new Undergraduate("6411271","Lynn","Thit"); // Student is the parent of underraduate
        undergraduate.setScore(0,5); // true if print out result
        undergraduate.setScore(1,5); // true if print out result
        undergraduate.setScore(2,5); // true if print out result
        undergraduate.setScore(3,5); // true if print out result
        System.out.println(undergraduate.setScore(4,5)); // true if print out result
        System.out.println(undergraduate.setScore(5,4)); // false if print out result

        System.out.println(undergraduate.getScore(0));
        System.out.println(undergraduate.getScore(1));
        System.out.println(undergraduate.getScore(2));
        System.out.println(undergraduate.getScore(3));
        System.out.println(undergraduate.getScore(4));

        System.out.println("Main test result --> "+undergraduate.toString());

        Student graduate1 = new Graduate("64112719" , "Thit", "Lynn"); // Student is the parent of Graduate
        graduate1.setScore(0,3); // true if print out result
        graduate1.setScore(1,3); // true if print out result
        graduate1.setScore(2,3); // true if print out result
        graduate1.setScore(3,6); // false if print out result
        graduate1.setScore(4,9); // false if print out result
        System.out.println(graduate1.setScore(5,3)); // false
        System.out.println(graduate1.setScore(4,13)); // false

        System.out.println("Main test result --> "+graduate1.toString());

        Student student1 = new Student("1721146", "Lynn", "Tit");
        System.out.println("Main test result --> "+student1.toString());

    }



}
