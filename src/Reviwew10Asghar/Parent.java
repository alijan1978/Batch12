package Reviwew10Asghar;

class GrandParent{
    String name;
    GrandParent(String name){
        System.out.println("Grand parent");
        this.name= name;
    }
    void printName(){
        System.out.println(name);
    }
}
public class Parent extends GrandParent{
    Parent(String name){
        super(name);
        System.out.println("Parent");
    }
   }
class Child extends Parent{
    Child(String name){
        super(name);
        System.out.println("Child");
    }
}
class Tester{
    public static void main(String[] args) {
        Child child = new Child("Mohammad Ali");
        child.printName();
    }
}