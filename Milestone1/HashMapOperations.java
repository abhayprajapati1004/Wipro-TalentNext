import java.util.*;

public class HashMapOperations {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Key1", "Value1");
        map.put("Key2", "Value2");

        System.out.println("Does Key1 exist? " + map.containsKey("Key1"));
        System.out.println("Does Value2 exist? " + map.containsValue("Value2"));

        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, String> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}