package ReviewSohail8;

public class StringClass2 {
    public static void main(String[] args) {

        String student = "Mohammad";
        System.out.println(student.startsWith("M")); //is the first letter of name is "M" ?

       //This below is called "Method chaining" because we use more than one method to call
        System.out.println(student.toLowerCase().startsWith("M"));
        //if student name starts with lower case, then this is false here.
        //otherwise, both is true

        System.out.println(student.endsWith("d")); //the last character (word) in username

        System.out.println(student.contains("h")); //boolean condition, does it have "h" ?

        String name= "Habib";
        char output = name.charAt(2); //return the character that exist in 2nd index position (0,1,2)
        System.out.println(output);

    }
}
