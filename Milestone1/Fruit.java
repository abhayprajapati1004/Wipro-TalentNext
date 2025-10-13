public class Fruit {
    String name;
    String taste;
    String size;

    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    public void eat() {
        System.out.println("Eating " + name + " which tastes " + taste);
    }
}

class Apple extends Fruit {
    public Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Eating an Apple which is sweet and crunchy");
    }
}

class Orange extends Fruit {
    public Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    public void eat() {
        System.out.println("Eating an Orange which is juicy and tangy");
    }

    public static void main(String[] args) {
        Fruit apple = new Apple("Apple", "Sweet", "Medium");
        Fruit orange = new Orange("Orange", "Tangy", "Large");

        apple.eat();
        orange.eat();
    }
}