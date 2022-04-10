package Class26;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsDemo1 {

  //  ******* VERY IMPORTANT part after oops.... Interview questions definitely
  public static void main(String[] args) {

      String name = "Mohammad";
      String name2 = "Ali";
      // NOT scalable if we have to store large amount of Data.
      // Arrays can be good option to tackle this problem

      String [] names = {"Mohammad", "Abdullah"};

        //names[2] = "Sadeea"; // ArrayIndexOutOfBound error because the names index are just 0 & 1.
        String [] names2=new String[1000];
        names2[0] = "Zainab";
        names2[2]="Sadeea";
      System.out.println(Arrays.toString(names2));

        // ArrayList -- > name of the class
        //  < > -- > Diamond Operators
        // String -- > datatype
      ArrayList<String> syntaxStudents = new ArrayList<>();

      syntaxStudents.add("Khadija");
      syntaxStudents.add("Abdullahjan");
      syntaxStudents.add("Zainaboo");

      System.out.println(syntaxStudents);






  }
}
