package Reviwew10Asghar;

public class Bike {

    int maxSpeed=100;
    int engineCC=125;
    void printMaxSpeed(){
        System.out.println(maxSpeed);
    }
    void printEngineCC(){
        System.out.println(engineCC);
    }
}
class HondaBikes extends Bike{
    int maxSpeed=150;
    int engineCC=125;
    void printEngineCC(){
        System.out.println(engineCC);
    }

    void printMaxSpeed(){
        int maxSpeed=200;//local variable first
        System.out.println(maxSpeed);//200
        System.out.println(this.maxSpeed); // 150
        System.out.println(super.maxSpeed); // prints 100
        }
        void printInfoFromParentAndChild(){
        printEngineCC();
        printMaxSpeed();
        super.printEngineCC();
        }
    }
class BikeTester{
    public static void main(String[] args) {
        HondaBikes hondaBikes = new HondaBikes();
       // hondaBikes.printMaxSpeed();
        hondaBikes.printInfoFromParentAndChild();
    }
}
