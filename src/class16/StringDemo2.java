package class16;

public class StringDemo2 {
    public static void main(String[] args){

        String str="1212334!!@#$fdgdfgADSDSDFDDHJ";

        System.out.println(str.replaceAll("[0-9]", ""));//replace with empty space
        System.out.println(str.replaceAll("[0-9]", "please"));//replace each 1212334 to please
        System.out.println(str.replaceAll("[A-Z]", "0"));//replace the Capital letter to zero 0
        System.out.println(str.replaceAll("[a-z]", "A"));//replace small letter to capital letter
        System.out.println(str.replaceAll("[@]", "Love"));// to replace @ sign to Love
        System.out.println(str.replaceAll("[^A-Z0-9]", "Alija n")); //replace Not the numbers and capital letter
        //but replace the other symbols to Alija n.


    }
}
