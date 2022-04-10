package Class25;

public interface Healthy {
    void Healthy();

    }
interface Portable{
    void canCarry();
}
interface Eatable{
    void eat();
}
class Orange implements Healthy,Portable,Eatable {


    @Override
    public void eat() {
        System.out.println("we can eat orange");
    }

    @Override
    public void Healthy() {

    }

    @Override
    public void canCarry() {

    }
}

    class Laptop implements Portable {
        @Override
        public void canCarry() {
            System.out.println("we can carry a laptop easily");
        }
    }
