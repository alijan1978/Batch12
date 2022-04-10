package Class29;

import java.util.HashMap;
import java.util.Map;

public class MapsDemo2 {
    public static void main(String[] args) {

        Map<String, Integer> fruit = new HashMap<>();
        fruit.put("Orage", 10);
        fruit.put("Apple", 1000);
        fruit.put("Banana", 15);

        Map<String, Integer> vegetables=new HashMap<>();
        vegetables.put("Potato", 4);
        vegetables.put("tomato", 10);

        Map<String, Integer> grocery=new HashMap<>();
        grocery.putAll(fruit);

    }
}
