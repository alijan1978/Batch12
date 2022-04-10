package class16;

public class Recap {
    public static void main(String[] args){

        String str="Mohammad is great #51045698 my number";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(3));

        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-1)); //if we want to print out the last word, should put -1 at the end
        System.out.println("*******************************************************");

        System.out.println(str.indexOf('A')); //case sensitive because the Capital A doesnt exist, result = -1
        System.out.println(str.indexOf('a'));// the first "a" letter from "Mohammad"
        System.out.println(str.lastIndexOf('a'));//the last "a" letter which is from "great"
        System.out.println("*******************************************************");

        System.out.println(str.indexOf("#"));//to get a specific letter or word
        System.out.println(str.substring(str.indexOf("#")+1));//to get the last character or numbers, without # sign put +1
        System.out.println(str.substring(str.indexOf("#")+1, str.indexOf("#")+1+11));
        System.out.println(str.substring(12 ,17));//another way to get specific index of sentence "great"






    }
}
