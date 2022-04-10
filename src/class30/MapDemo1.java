package class30;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {

        HashMap<String,Double> fruitMap = new HashMap<>();
       // fruitMap.put("Apple", 20); // auto-casting does not work in Collection and Maps

        fruitMap.put("Apple", 20.0);
        fruitMap.put("Banana", 10.0);
        fruitMap.put("Kiwi", 105.0);
        fruitMap.put("Orange", 40.0);
        fruitMap.put("Mango", 50.0);
        fruitMap.put("Banana", 25.0); // Duplicate values are Overwritten, so JUST the last value is retained
                                       // The original/first one will not be written

        System.out.println(fruitMap);
        System.out.println(fruitMap.get("Kiwi"));    // with .get we get the value of Kiwi -> 105
                         // Also its case sensitive, if wrong spelling, upper case then it prints Null.
        fruitMap.remove("Mango"); // remove
        System.out.println(fruitMap);

        System.out.println(fruitMap.containsKey("Orange")); // to search if Orange key is present or not (True/False)
        System.out.println("dog");
        System.out.println(fruitMap.containsValue(20.0));// to search if the value is present or not(true/false)
        System.out.println(fruitMap.isEmpty()); // to see the Map is empty or not... which is not true
        System.out.println(fruitMap.size());    //to the size
        System.out.println(fruitMap.replace("Banana", 500.0));    // to replace the value of Banana 10.0 to 500
                                                                    // BUT cannot replace the Key or Banana
                                                                    // we can remove banana then to insert what we want
        System.out.println(fruitMap);




    }
}
