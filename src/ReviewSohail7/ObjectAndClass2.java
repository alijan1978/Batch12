package ReviewSohail7;

public class ObjectAndClass2 {

    //Writing method in the class to return the record
    String getRecord(){
        String department="QA";
        String empName="Mohammad";
        String details="Worker "+empName+" belongs to "+department;
        System.out.println(details);
        return details;
    }
    public static void main(String[] args){

        //Creating an object of class
        ObjectAndClass2 obj=new ObjectAndClass2();
        obj.getRecord();
    }

}
