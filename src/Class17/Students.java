package Class17;

public class Students {

    String name;
    String id;
    static int numberOfStudents;

/*
Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
 */

    public static void main(String[] args){
        Students student1=new Students();
        student1.name="Abdullah";
        student1.id="786";
        Students.numberOfStudents++;

        Students student2=new Students();
        student2.name="Sadoo";
        student2.id="456";
        Students.numberOfStudents++;

        Students student3=new Students();
        student3.name="Zainab";
        student3.id="123";
        Students.numberOfStudents++;
        System.out.println(Students.numberOfStudents);

    }

}
