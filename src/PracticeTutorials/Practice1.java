package PracticeTutorials;

public class Practice1 {
    public static void main(String[] args) {

// Practicing Arrays
    String username1="Ali";
    String username2="Wajia";
    String username3="Khajoo";
    String username4="Sadoo";
    String username5="Deloo";
    String username6="Zainaboo";
    //Instead of typing too many String variables and username, JUST one time make String[ ] means I have many Strings
        //Or lets say, [] sign shows the excessive data stored in Arrays.
        //Data Type [] name ={}
        //access name {indexNumber}
        //Data Type [] name= new Data Type [1000]; //create object to store 1000 data in Arrays form

        String[] usernames={"Ali","Wajia","Khajoo","Sadoo","Deloo","Zainaboo"};
        //Store them in one String [] array
        //now we can call them by their index numbers starting from 0-5

        System.out.println(usernames[2]);
        usernames[2]="Khajoo gak"; // we can change the value of our variable
        System.out.println(usernames[2]);
        System.out.println("-------------------------------------------------");

        int[] grades={12, 34,43,54,45,65,75,21};
        System.out.println(grades[5]); //number 65 is in index 5

        double[] gradelist=new double[1000];//Example of decimal value
        gradelist[0]=12.4;
        System.out.println(gradelist[0]);













    }
}
