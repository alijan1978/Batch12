package ReviewSohail8;

public class StringClass3 {
    public static void main(String[] args) {

        String batch = "Batch 12";

        String course = "sdet";

        String college = "         Syntax     Tech         ";      // to remove space from two side NOT inside... trim method
        System.out.println(college.trim());

        String name = "Abdullah  Jan    Qandol     samandol";
        System.out.println(name.replaceAll(" ", "")); // remove spaces inside each word

        if("Batch 12".equals(batch) && "SDET".equals(course)){
            System.out.println("You will get the link to MS's lecture");
        }else{
            System.out.println("Watch my YouTube channel");
        }

        if("Batch 12".equalsIgnoreCase(batch) && "SDET".equalsIgnoreCase(course)){// dont care upper/lower case
            System.out.println("Now all types of inputs are accepted");
        }


    }
}
