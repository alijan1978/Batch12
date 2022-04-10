package Class19;

public class Task4 {
    /*
Write a Student class   that have instance variables name and address.
Create a constructor that will initialize those variables.
Print name & address of given  student using displayInfo method.
 */

    String name;
    String address;

    public Task4(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void displayInfo() {
        System.out.println(this.name + " " + this.address);

    }
}