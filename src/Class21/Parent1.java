package Class21;

public class Parent1 {

    String name = "Parent";// If there is No Local & Instance variables (below), This parent variables executes.
    void printName() {
        System.out.println(name);
    }
}
class Child1 extends Parent1{
    String name = "Child";// Second priority is this Instance variable
    void printName(){
        String name = "Zainab jan";// First priority is given to this local variables
        System.out.println(name);
        System.out.println(this.name);// first Local variable Then the Instance variable.
        //When we use the "this" keyword, even though we have a local variable, Java will only bring the values from Instance variables


        System.out.println(super.name);// When we use the "super" keyword even though we have a Local variable and
        //Instance variables inside the same class, Java will only bring the values from the Parent class instance variables.
        //We are Overwriting the priority on Parent class, despite the local & instance variables.

    }
}
    class ParentTester{
        public static void main(String[] args) {
            Child1 child1 = new Child1();
            child1.printName();
        }
    }