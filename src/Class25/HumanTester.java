package Class25;

public class HumanTester {
    public static void main(String[] args) {

        SuperMan superMan = new SuperMan();
        superMan.walk();
        // SuperMan.printLegs(); // instead use the interface name

        Human.printLegs();
        LivingBeing.printLegs();

    }
}
