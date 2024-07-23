package equipment.music;

public class Ipod implements Music {
    @Override
    public void play() {
        System.out.println("Playing the music");
    }

    @Override
    public void pause() {
        System.out.println("Pause");
    }

    @Override
    public void selectMusic() {
        System.out.println("Select music");
    }
}
