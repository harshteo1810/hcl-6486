package Module2_Day8;

public class MainClass {

    public static void main(String[] args) {

        student s = new student();

        System.out.println(s.name);     // Allowed
        // System.out.println(s.age);  // Error: private
        System.out.println(s.course);   // Allowed
        System.out.println(s.college);  // Allowed
    }
}