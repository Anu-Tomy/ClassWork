import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        /* Linked List Declaration */
        LinkedList<String> linkedList = new LinkedList<String>();

        /*add(String Element) is used for adding
         * the elements to the linked list*/
        linkedList.add("Milk");
        linkedList.add("Cheese");
        linkedList.add("Egg");
        linkedList.add("Bread");

        /*Display Linked List Content*/
        System.out.println("Linked List Content: " + linkedList);

    }
}
