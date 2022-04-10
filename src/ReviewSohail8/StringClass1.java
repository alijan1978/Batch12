package ReviewSohail8;

public class StringClass1 {
    public static void main(String[] args) {

       //Two ways to define the String

        String batch = "SDET Batch 12"; // this is mostly used
      //  String batch12 = new String("My value");

        String employee = "MOHAMMAD";
        System.out.println(batch);

        System.out.println(batch.toUpperCase()); //convert small letter to upper case
        System.out.println(employee.toLowerCase()); //convert upper case to lower case

        String employeeName = "Ali, Abdullah";  //to get the length of a string
        System.out.println(employeeName.length());


    }
}
