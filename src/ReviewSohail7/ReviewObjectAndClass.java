package ReviewSohail7;

public class ReviewObjectAndClass {
    String empName="Mohammad"; // Local variables
    int empID=12345; // Local variables
    String group;

    void employDetails(){ // declaring method ..."Void" means not return anything
        System.out.println("This method shows the details of the employee");

        //But if we move the String and int outside method, wil be become Instance method.
        //Scope of variables are: we can access them inside the method
    }

    void employeeGroup(){
        System.out.println("This method shows the group fo the employee");
    }

    public static void main(String[] args) {
        ReviewObjectAndClass obj = new ReviewObjectAndClass();
        obj.employDetails();
        obj.employeeGroup();


    }

}
