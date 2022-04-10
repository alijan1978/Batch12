package class16;

public class StringDemo3 {
    public static void main(String[] args) {

        String s="This is a sentence";
        String[] strArr=s.split(" ");
        System.out.println(strArr.length);
        System.out.println(strArr[0]);
        System.out.println(strArr[3]);

        String s2="This is a sentence. Batch 12 is great."+
                "Asghar is super great instructor";
        String[] strArr2=s2.split("[.]");
        System.out.println(strArr2.length);
        System.out.println(strArr2[2].trim());//remove the space




    }
}
