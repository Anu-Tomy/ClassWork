import com.sun.javafx.css.StyleCache;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        //declaration
        HashMap<Integer,String> hashMap = new HashMap<Integer, String>();

        //Adding elements to the HashMap
        hashMap.put(5, "Tom");
        hashMap.put(2,"Chris");
        hashMap.put(7,"Matt");
        hashMap.put(15,"Kevin");
        hashMap.put(35,"Alex");

        System.out.println("HashMap contains:  " + hashMap);

        // Creating another HashMap
        HashMap<Integer,String> hashMap2 = new HashMap<Integer, String>();

        // cloning first HashMap in the second one
        hashMap2 = (HashMap)hashMap.clone();
        System.out.println("Cloned map contains: " + hashMap2);


        //Display contents
        // create set view for the map
        Set set = hashMap.entrySet();

        // check set values
        System.out.println("Set values: " + set);

        //Get values based on key
        String keyval = hashMap.get(7);
        System.out.println("Value of key 7 is: "+ keyval);

        // Display content using Iterator
        //Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mEntry = (Map.Entry)iterator.next();
            System.out.print("Key is: "+ mEntry.getKey() + " & Value is: ");
            System.out.println(mEntry.getValue());
        }

        //Remove values based on key
        hashMap.remove(7);
        System.out.println("\nMap key and values after removal:");
        Set set2 = hashMap.entrySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Map.Entry mEntry2 = (Map.Entry)iterator2.next();
            System.out.print("Key is: "+mEntry2.getKey() + " & Value is: ");
            System.out.println(mEntry2.getValue());
        }
    }
}
/*
It is not an ordered collection which means it does not return the keys and values
in the same order in which they have been inserted into the HashMap

Set values: [2=Chris, 35=Alex, 5=Tom, 7=Matt, 15=Kevin]

Value of key 7 is: Matt
Key is: 2 & Value is: Chris
Key is: 35 & Value is: Alex
Key is: 5 & Value is: Tom
Key is: 7 & Value is: Matt
Key is: 15 & Value is: Kevin

Map key and values after removal:
Key is: 2 & Value is: Chris
Key is: 35 & Value is: Alex
Key is: 5 & Value is: Tom
Key is: 15 & Value is: Kevin
*/
