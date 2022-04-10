//package Class21;
//
//public class ClassAA {
//    String name;
//    int age;
//    double weight;
//
//    public ClassAA(String name, int age, double weight) {
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
//    }
//    void printInfo(){
//        System.out.println(name+" "+age+" "+" "+weight);
//    }
//}
//
//class ClassBB extends ClassAA {
//    public classBB(String name, int age, double weight){
//        super(name, age, weight);
//
///*
// Because constructors from the Parent class don't participate in Inheritance, we need to create
// a matching constructor in the child classes as well. We can use: super ( ) to call the constructor from  the
// parent class so that we don't have to repeat the code
// */
//    }
//}
//
//class Test{
//    public static void main(String[] args) {
//        ClassAA classAA=new ClassAA("Zainab", 21, 80);
//        classAA.printInfo();
//    }
//}