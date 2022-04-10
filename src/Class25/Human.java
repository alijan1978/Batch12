package Class25;

public interface Human {

  // public static final is redundant because by default all the variables are public static final
    // we cannot create object of interface, and cannot have Private modifier

    //public static final int legs=2; ...instead use the below

    int legs=2;

    //public abstract void walk(); //// instead use the below

    void walk();
    static void printLegs(){
        System.out.println(legs);
    }
    public default void noNeedToWorry(){
        System.out.println("default methods are there to functional programming");
    }
   }
    interface LivingBeing{
    static void printLegs(){
        System.out.println("Not sure");

        }
    }
   class SuperMan implements Human,LivingBeing{

       @Override
       public void walk() {
           System.out.println("I can walk");
       }


   }