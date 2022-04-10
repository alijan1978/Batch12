package Class21;

public class SuperKeyWord {
    public static void main(String[] args) {
        Child child=new Child();
        child.printColor();
    }

}
    class GrandParent{
        String color="Blue";
    }

    class Parent{
    String color="Black";

}
    class Child extends Parent{
    String color="Red";

    void printColor(){
        String color ="Green"; //Local variables
        System.out.println(color);
        System.out.println(this.color); // Instance varaible
        System.out.println(super.color);//parent variable

    }
    }