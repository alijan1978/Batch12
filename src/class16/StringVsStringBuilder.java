package class16;

public class StringVsStringBuilder {
    public static void main(String[] args) {

        String s = "Mohammad Ali is Great";//Original string **IMPORTANT (when we call a method in String class, we cannot change.
        // once we assign a variable to String and type something
        //then no change/concat can happend UNLESS we reassign or retype the changes

        s.concat("SUPER"); //add or concat new String SUPER to the string

        System.out.println(s.replace(" ", ""));//remove space
        System.out.println(s);

        StringBuilder stringBuilder = new StringBuilder("Mohammad Ali is Great");//print actual sentence


        stringBuilder.append("SUPER");//append use the concat method or add
        //System.out.println(stringBuilder.reverse());//prints out in reverse
        //System.out.println(stringBuilder);//this also prints in reverse
        System.out.println(stringBuilder);
        System.out.println("***********************************");


    }



}
