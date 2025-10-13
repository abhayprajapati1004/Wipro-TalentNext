import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Apple");
        treeSet.add("Banana");
        treeSet.add("Cherry");

 
        System.out.println("Original TreeSet: " + treeSet);
        
        System.out.println("Reversed TreeSet: ");
        Iterator<String> iterator = treeSet.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

 
        System.out.println("Iterating TreeSet: ");
        iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

         
        System.out.println("Does 'Banana' exist? " + treeSet.contains("Banana"));
    }
}