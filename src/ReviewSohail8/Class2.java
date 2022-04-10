package ReviewSohail8;

public class Class2 {

    String generateUsername(String firstName, String lastName){

        return firstName+"123"+lastName+".com";
    }

        static void aliDemand(){
            System.out.println("This is Ali's function");
        }

    public static void main(String[] args) {
        aliDemand();
        Class2 obj = new Class2();
        System.out.println(obj.generateUsername("Ali", "Jan"));
    }


}
