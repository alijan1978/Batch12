package Class23;

public class StaticDemo {

    }

    class Cat{
        static int noOfLegs=4;
        String name;

     Cat (String name){
         this.name=name;
     }

        public void printInfo(){

            System.out.println(name+noOfLegs);

        }
        public static void Print(){
// we cannot access the Instance Fields directly inside the static methods
           // System.out.println(name+noOfLegs);
            //Because we cannot use Instance Fields with Static Method
            //System.out.println(name);
        }

        public static void main(String[] args) {
            Cat cat = new Cat("Stella");

            Cat.Print();
            Cat cat2 = new Cat("Neutella");
            Cat.Print();
        }
    }
