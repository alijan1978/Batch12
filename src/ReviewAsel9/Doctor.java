package ReviewAsel9;

public class Doctor {

    // Instance variables: should be declared inside the class, BUt ouside of any method, constructor or block { }.

    String firstName, lastName, speciality;

    // static variable: when we have one shared common, we create it static.
    // static should be declared inside the class, but ouside of any method, constructor or block of code.
    // it should have static keyword)

        static String hospital = "Georg Washinton";

    // static methods can access only with static members.
        static void work(){
            System.out.println("All doctors work at "+ hospital);
        }
        // Constructor - initializing instance variables


    public Doctor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

// we can have multiple constructor by overloading them

    Doctor(String firstName, String lastName, String speciality){

            this(firstName, lastName);
            this.speciality = speciality;
    }

      // Non-static methods can access static members.
        void work1(){
            System.out.println("All doctors work at "+hospital);
        }

    // static method cannot access Non-static members.
    // static void printInfo(){
      //  System.out.println("Doctor "+firstName+" "+lastName+" is a "+speciality);

}
