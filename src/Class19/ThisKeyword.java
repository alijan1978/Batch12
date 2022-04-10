package Class19;

public class ThisKeyword {

    String name;
    String color;
    int age;
    double weight;

    public ThisKeyword(String name, String color, int age, double weight) {
        this.name = name;
        this.color = color;
        this.age = age;
        this.weight = weight;
    }

    void printINfo(){
       System.out.println(name+" "+color+" "+age+" "+weight);

    }

}
