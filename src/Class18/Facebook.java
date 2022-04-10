package Class18;

public class Facebook {

   private String userName;
   private String password;
   private int age;

   void setAge(int personAge){
       if(personAge>5 && personAge<80){
          age=personAge;

       }else {
           System.out.println(" Not allowed, its not a Horse");
       }
   }

   int getAge (String userPassword){ // to protect the age with correct password
       if (userPassword.equals(password)){
           return age;
       }else {
           return -1;
       }
   }



}
