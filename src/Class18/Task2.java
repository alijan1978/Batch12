package Class18;

public class Task2 {

//Create a method that will take a String as a parameter and returns reversed String
// Method should be available to all classes within your project and accessible by class name.

    public static String reverseString(String input){
//        StringBuilder stringBuilder=new StringBuilder(input);
//        stringBuilder.reverse();
//        return stringBuilder.toString();
        return new StringBuilder(input).reverse().toString();
// new StringBuilder(input) is called object creation
// new StringBuilder(input).reverse() calling a method on that object
// new StringBuilder(input).reverse().toString() called two methods on that object...
        //...called two methods on that object and returning the results
//return new StringBuilder(input).reverse().toString();
    }

    public static void main(String[] args){
        String name="Asghar";
        System.out.println(Task2.reverseString(name));

    }



}
