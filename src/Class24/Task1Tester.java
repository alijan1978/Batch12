package Class24;

public class Task1Tester {
    public static void main(String[] args) {
// in java, we can store the object of a child classes in a parent type variable.
//  Every class in java can be treated as Data type.
        Student syntaxStudent = new SyntaxStudent();
        //syntaxStudent.study();// line 16 printed (Syntax student must study 25 hours)
        Student schoolStudent = new SchoolStudent();
    /*
    as we can store the object of a child class ina parent class, we can also
    create an array of these students as shown below:
     */
        Student[] students = {new SyntaxStudent(), new SchoolStudent(),
                new CollegeStudent()};

    /*
    int[] arr={1,2,3};
        for(int number: arr
        ) {
        System.out.print(number);
        }
     */

        for (Student student : students

        ) {
            student.study();
            student.doHomeWork();
            student.practice();

        }
    }

}
