package Class17;

public class SyntaxEmployee {
    String empId;
    double salary; // OR we can use "int" to remove decimal
    static String CEO="Sumair";

    public static void main(String[] args) {

        SyntaxEmployee aselsClassObject=new SyntaxEmployee();
        aselsClassObject.empId="123";
        aselsClassObject.salary=200000;
        System.out.println(aselsClassObject.empId);
        System.out.println(aselsClassObject.salary);
        System.out.println(SyntaxEmployee.CEO);

        System.out.println("**********************************************************");
        SyntaxEmployee mozzamObject=new SyntaxEmployee();
        mozzamObject.empId="456";
        mozzamObject.salary=19000;
        System.out.println(mozzamObject.empId);
        System.out.println(mozzamObject.salary);
        System.out.println(SyntaxEmployee.CEO);


    }

}
