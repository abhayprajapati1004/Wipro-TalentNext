interface Playable {
    void play();
}


class Veena implements Playable {
    @Override
    public void play() {
        System.out.println("Veena is playing");
    }
}

 
class Saxophone implements Playable {
    @Override
    public void play() {
        System.out.println("Saxophone is playing");
    }
}

public class TestInterface {
    public static void main(String[] args) {
 
        Veena veena = new Veena();
        veena.play();

 
        Saxophone saxophone = new Saxophone();
        saxophone.play();

        
        Playable playableVeena = veena;
        playableVeena.play();

        Playable playableSaxophone = saxophone;
        playableSaxophone.play();
    }
}