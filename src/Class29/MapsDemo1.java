package Class29;

import java.util.ArrayList;
import java.util.HashMap;

public class MapsDemo1 {
    public static void main(String[] args) {

        ArrayList<String> names=new ArrayList<>();
        names.add("Mohammad Ali");
        names.add("Abdullah");
        System.out.println(names.get(0));

        HashMap<Integer, String> map=new HashMap<>();
        map.put(234555387, "Mohammad Ali");// SSN
        map.put(4433224, "Abdullah");
        //System.out.println(map.get(2345553));
        System.out.println(map.get(234555387));

        //Another Example

        HashMap<String,String> groceries=new HashMap<>();
        groceries.put("Zainab", "eggs, milk, bread etc");
        groceries.put("Sadeea", "banana, apple, orange");
        groceries.put("Asghar", "macbook, iPhone 13, Apple monitor, etc");
        System.out.println("Zainab");

    }
}
