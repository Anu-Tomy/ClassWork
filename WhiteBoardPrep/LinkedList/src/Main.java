import com.sun.javafx.css.Declaration;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        // Linked List Declaration
        LinkedList<String> linkedList = new LinkedList<String>();

        /*add(String Element) is used for adding
         * the elements to the linked list*/
        linkedList.add("Milk");
        linkedList.add("Cheese");
        linkedList.add("Egg");
        linkedList.add("Bread");

        /*Display Linked List Content*/
        System.out.println("Linked List Content: " + linkedList);

        //Add First and Last Element
        linkedList.addFirst("First Item");
        linkedList.addLast("Last Item");
        System.out.println("LinkedList Content after addition: " +linkedList);

        // get and set values
        Object var1 = linkedList.get(0);
        System.out.println("First element: "+ var1);

        linkedList.set(0,"Changed first element");
        Object var2 = linkedList.get(0);
        System.out.println("First element after update by set method: " + var2);

        //Remove first and last element
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("LinkedList after deletion of first and last element: " + linkedList);

        //Add to a position
        linkedList.add(1,"Newly added item");
        System.out.println("New List: " + linkedList);

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Chips");
        arrayList.add("Chicken");
        arrayList.add("Carrot");

        //add all the elements to the list
        linkedList.addAll(arrayList);
        System.out.println("After adding Array elements: " + linkedList);

        //Remove from a position
        linkedList.remove(3); //Egg
        System.out.println("Final Contents in the list: " + linkedList);

        //number of elements of the list
        System.out.println("Number of elements in this list: " + linkedList.size());

        //make a copy of the list
        Object cpy = linkedList.clone();
        System.out.println("Copy of Linkedlist is : " + cpy);



    }
}
