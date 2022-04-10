package Class21;

public class ClassA {

    void method() {
        System.out.println("Method from Class A");
    }
}
    class ClassB extends ClassA {
        void method() {
            System.out.println("Method from ClassB");
        }

        void test() {
            method();  // Calls the same class method
            this.method(); // Calls the same class method
            super.method(); // Calls the Parent class method (overwrite)
        }
    }
    class Tester{
        public static void main(String[] args) {
            ClassB classB = new ClassB();
            classB.test();

    }
}
