import java.util.Random;


abstract class Compartment {
    public abstract String notice();
}


class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "This is First Class. Please keep your belongings safe.";
    }
}

class Ladies extends Compartment {
    @Override
    public String notice() {
        return "This is Ladies Compartment. Please be respectful.";
    }
}

class General extends Compartment {
    @Override
    public String notice() {
        return "This is General Compartment. Be cautious with your luggage.";
    }
}

class Luggage extends Compartment {
    @Override
    public String notice() {
        return "This is Luggage Compartment. Handle with care.";
    }
}

public class TestCompartment {
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];
        Random random = new Random();

        for (int i = 0; i < compartments.length; i++) {
            int type = random.nextInt(4) + 1; 
            switch (type) {
                case 1:
                    compartments[i] = new FirstClass();
                    break;
                case 2:
                    compartments[i] = new Ladies();
                    break;
                case 3:
                    compartments[i] = new General();
                    break;
                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }

        for (Compartment compartment : compartments) {
            System.out.println(compartment.notice());
        }
    }
}