package class16;

public class Task4 {
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Sunday is holiday");

        System.out.println(stringBuilder.reverse()); // to print out Sunday is holiday in REVERSE

        String s = "Sunday is great";
        Task4 task4 = new Task4();
        //System.out.println(task4.reverseString(s));
        String[] strArray = s.split(" ");
        // System.out.println(strArray[0]);
        for (int i = 0; i < strArray.length; i++) {
            System.out.println(task4.reverseString(strArray[i] + " "));
        }
    }
    String reverseString(String inputString) {
// converting S string to Stringbuilder so that we can use the reverse method
        StringBuilder stringBuilder=new StringBuilder(inputString);
        stringBuilder.reverse();

        return stringBuilder.toString();


    }
}