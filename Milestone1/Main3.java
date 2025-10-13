import com.wipro.automobile.ship.compartment;

public class Main3 {
    public static void main(String[] args) {
        compartment c = new compartment(10.0, 5.0, 3.0);
        System.out.println("Height: " + c.getHeight());
        System.out.println("Width: " + c.getWidth());
        System.out.println("Breadth: " + c.getBreadth());
    }
}