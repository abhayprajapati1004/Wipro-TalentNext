public class Box {
    private double width;
    private double height;
    private double depth;

    // Parameterized constructor
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate the volume of the box
    public double calculateVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        // Create an object of the Box class
        Box box = new Box(5.0, 3.0, 2.0);

        // Test the functionalities
        System.out.println("Volume of the box: " + box.calculateVolume());
    }
}