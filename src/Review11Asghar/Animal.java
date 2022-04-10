package Review11Asghar;

public class Animal {

    void Sleep(){
        System.out.println("");
    }
}
class Dog extends Animal{
    void Sleep(){
        System.out.println("Dog sleeps during the day");
    }
}
class Cat extends Animal{
    void Sleep(){
        System.out.println("Cat sleeps all the day");
    }

    void eat() {
    }
}

class Test2 {
    public static void main(String[] args) {
        //Cat cat=new Dog();
        //Cat cat = new Animal(); // down casting OR narrowing ...We cannot

        Animal animal = new Cat(); // Upcasting OR using widening
        animal.Sleep();
        // animal.eat();  We cannot use the methods that are specific to Cat Class ONLY because
        // ... right now it is behaving as an animal
        // Dog dog=(Dog)animal;
        // dog.Sleep();

        method(new Dog());
    }


    public static void method(Animal animal) {
        if (animal instanceof Cat) {
            ((Cat) animal).eat();
        } else {
            System.out.println("You are not passing a cat inside the box animal");
        }
    }
}
