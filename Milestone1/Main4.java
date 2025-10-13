class Employee implements Cloneable {
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + "]";
    }
}

public class Main4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee original = new Employee("John Doe", 30);
        Employee clone = (Employee) original.clone();

        System.out.println("Original Employee: " + original);
        System.out.println("Cloned Employee: " + clone);

        original.setName("Jane Doe");
        original.setAge(31);

        System.out.println("After modifying the original:");
        System.out.println("Original Employee: " + original);
        System.out.println("Cloned Employee: " + clone);
    }
}