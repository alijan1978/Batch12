package Class17;

public class HealthyDog {

 // when the information is expected to be different from object to object
 // then , we store that information in an instance variable

    String name; //instance variable
    String color; //intance variable

    //if we know that a value will stay same for all the objects of a cass
    //we create a static variable for that why because

    static int numberOfLegs=4; // static variable

    void eat(){
        int noOfTimes=3; // local variable
        System.out.println(name+" eats "+noOfTimes);
    }

    void sleep(){
      //  System.out.println(name+" sleeping "+numberOfTimes); //can access local variables in other words
    }


    public static void main(String[] args) {

        HealthyDog dog=new HealthyDog(); // "dog" is local variable

        dog.name="scooby";
        dog.color="pink";
        HealthyDog.numberOfLegs=6;//if we change the legs to 6, it update the memory though in above Static.int, we said legs=4;
        dog.eat();

        HealthyDog dog2=new HealthyDog();
        dog2.name="tomy";
        dog2.color="Navi blue";
        System.out.println(HealthyDog.numberOfLegs);
        dog2.eat();
    }

}
