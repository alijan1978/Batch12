package class16;

public class Task3 {
    public static void main(String[] args) {

 String a="Is it Saturday? Is it raining? Do we have Java class today?";

        System.out.println(a.length());
        // lenght( ) is String class method to count the number of characters

        System.out.println(a.split("[?.!]").length);//to show many Arrays here
        // JUST length property is that we can use to check the number of elements in an Array


    }

    String [] method(int [] numbers){
       String [] stringArr=new String[numbers.length];
       return stringArr;


    }

}
