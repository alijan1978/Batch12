package Class22;

public class IfElseDemo {
    public static void main(String[] args) {

      int number=10;
      /*
        The Ternary Operator has the limitation that it must return something we can't use it to print out things.
       */
      // number>10? System.out.println("Number is greater "): System.out.println("Number is smaller");


  }
  int maxNumber(int num1, int num2){

//        if(num1>num2){
//            return num1;
//        }else{
//            return num2;
//        }

      return num1>num2?num1:num2;
      // same like this: num1>num2 => the condition part


  }







}




