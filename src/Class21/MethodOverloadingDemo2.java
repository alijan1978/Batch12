package Class21;

public class MethodOverloadingDemo2 {


    void printInfo(String name, int age, double weight) {
        System.out.println("M1");
        System.out.println(name + " " + age + " " + weight);
    }

    void printInfo(int age, String name,double weight) {
        System.out.println(name + " " + age + " " + weight);
    }

    void printInfo(int age, double weight, String name) {
        System.out.println(name + " " + age + " " + weight);
    }
    void printInfo(double weight,int age,String name ){
        System.out.println(name+" "+age+" "+weight);
}

    public static void main(String[] args) {
        MethodOverloadingDemo2 methodOverloadingDemo2 = new MethodOverloadingDemo2();
        methodOverloadingDemo2.printInfo("Zainab jan", 16, 18.0);
    }

}