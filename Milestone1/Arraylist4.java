import java.util.ArrayList;

public class Arraylist4 {
    public static void main(String[] args) {
        ArrayList<Number> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20.5f);
        numberList.add(30.75);
        
        for (Number num : numberList) {
            System.out.println(num);
        }
    }
}