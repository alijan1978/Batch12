package Class20;

public class Lion extends Animal{

    boolean huntOthers=true;
    void roar(){
        System.out.println(name+" is roaring "+color+" huntOthers "+huntOthers);

    }

    public static void main(String[] args) {
        Lion lion=new Lion();
        lion.name="Sher";
        lion.color="grey";
        lion.sleep();
        lion.roar();


    }


}
;