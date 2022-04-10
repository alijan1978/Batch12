package class16;

public class Task2 {
    public static void main(String[] args) {

        /* Create a String that should be combination of letter, numbers and special characters.
        * find out how many alphanumeric characters are there in the String.

         */
        String s="12232434ASDFSAF@##$$&fgdgdh";
        System.out.println(s.length()); //original character's length


        System.out.println(s.replaceAll("[^A-Za-z0-9@#]", "").length());
        // just alphanumeric characters, Not " ^ "other symbols
        //Alphanumeric = Alphabet & numbers

    }
}
