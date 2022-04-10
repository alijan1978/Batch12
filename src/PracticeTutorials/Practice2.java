package PracticeTutorials;

public class Practice2 {
    public static void main(String[] args) {

// Arrays more example

    int[] a= new int[100];
    a[50] = 1200;
    String[] names= new String[45];
    names[0]="Mohammad Ali";
    names[1]="Abdullah";

        System.out.printf(names[1]);//printf  is String format

        int ii = 0;
        for(int m=0; m<45; m++){
            names[ii]="Mohammad Ali";
            ii++;
        }
        for(int j=0; j<45; j++){
            System.out.println("\n"); // prints with one space enter

            System.out.println(names[j]);
        }
        int[] iList={12,32,45,65,76,54,766};
        for (int i: iList ) {

            System.out.println(i+2); //prints iList by adding 2 to each number
        }
        // We have 3 types of errors:
        //1. Syntax error -> when we type a wrong datatype or something
        // 2. Runtime error --> when we see error in Console but not during writing the code
        // 3. Logical error --> this error is just not logical...that shouldnt be written
    }
}
