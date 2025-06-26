public class MusicBox implements MusicPlayer {


    @Override
    public void playMusic() {
        System.out.println("This music box is playing music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("This music box is paused music");
    }

    @Override
    public void stopMusic() {
        System.out.println("This music box is stopped music");
    }
}
