package Class18;

public class AccessModifiers {

    private String name="Naughty Zainab";
    int age; //default access modifier
    protected double weight=18;
    public String color="White";

    public static void main(String[] args){

        AccessModifiers am=new AccessModifiers();
        System.out.println(am.name);
        System.out.println(am.age);
        System.out.println(am.weight);
        System.out.println(am.color);
        



    }

}
