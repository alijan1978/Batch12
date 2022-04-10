package Review11Asghar;

import Class19.Car;

public abstract class Card {

// private abstract void showInterest(); // Not Allowed
//static abstract void showInterest(); // Not Allowed
   // abstract final void showInterest(); // Not allowed

    abstract void showInterest();

   // abstract Card(){ // constructor is also Not Allowed
    //}
}

 class Visa extends Card{

    @Override
    void showInterest(){
        //super.showInterest(); // no body inside the parent class, we cannot cal it
        System.out.println("23%");
    }


}