package ReviewSohail7;

public class ReviewClass3 {

    String studentName;
    String course;
    int studentId;
    int grades;

    void displayStudentsRecord(){
        System.out.println("The student name is: "+studentName+" and the course student is enrolled is "+course);
        System.out.println("The student ID is: "+studentId+" and the grades student achieved are "+grades);

    }
// ProtoType is:
    public static void main(String[] args) {

        //Creating the first object of class to assign first set of values
        ReviewClass3 Rev = new ReviewClass3();
        Rev.studentName="Ali ";
        Rev.course = "SDET";
        Rev.studentId =123;
        Rev.grades = 65;
        Rev.displayStudentsRecord();
        System.out.println("-------------------------------------------------");

        //Creating the second object of class to assign first set of values

        ReviewClass3 Rev1 = new ReviewClass3();
        Rev1.studentName = "Yazina";
        Rev1.course = "science";
        Rev1.grades = 91;
        Rev1.displayStudentsRecord();



    }
}
