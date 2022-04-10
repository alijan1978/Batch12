package Class19;

public class Car {

    String name="Toyota";
    String make;
    String color;
    String type;

//    Car(String name,String make,String color,String type){

        /*
        if we have same local and instance variables, Java always prefer local variables if you want
        to instruct Java to use instance variables, we use the "this Keyword" *****
           */
//         this.name=name;
//         this.make=make;
//         this.color=color;
//         this.type=type;

    //Shortcut to construct (right click --> Generate -->Constructor-->hold shift and select bottom-->Enter

        public Car(String name, String make, String color, String type) {
        this.name = name;
        this.make = make;
        this.color = color;
        this.type = type;
    }

    Car(){

    }

    void PrintCar(){
        String name="Tesla";
        System.out.println(name);
        System.out.println(this.name);
    }

}


