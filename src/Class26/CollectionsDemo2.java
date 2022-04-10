package Class26;

import java.util.ArrayList;

public class CollectionsDemo2 {
    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<>();
        countries.add("USA");
        countries.add("Turkey");
        countries.add("Morocco");
        countries.add("Afghanistan"); // countries index from 0 to 4 (AFG is index 3)
        countries.add("Iraq");

        System.out.println(countries.get(3));
       // System.out.println(countries.get(-1)); // no country exist

        System.out.println(countries); // 5 countries now
        countries.add(2,"Canada"); // We specify or insert the elements at this specified index
        // if we want to add an index number to something different (after Morocco Canada)

        System.out.println(countries); //show all countries , 6 now
        System.out.println(countries.size()); // size of indexes or countries which is 6

        countries.remove("Iraq"); // remove an index element
        System.out.println(countries); // now 5 countries WITHOUT Iraq
        countries.clear(); // shows array list empty
        System.out.println(countries);

//        countries.removeAll(countries);
//        System.out.println(countries);



    }
}
