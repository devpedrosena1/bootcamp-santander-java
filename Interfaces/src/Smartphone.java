public class Smartphone implements VideoPlayer, MusicPlayer {

    @Override
    public void playVideo() {
        System.out.println("This smartphone is playing video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("This smartphone is paused video");
    }

    @Override
    public void stopVideo() {
        System.out.println("This smartphone is stopped video");
    }

    // ----------------------------------


    @Override
    public void playMusic() {
        System.out.println("This smartphone is playing music");
    }

    @Override
    public void pauseMusic() {
        System.out.println("This smartphone is paused music");
    }

    @Override
    public void stopMusic() {
        System.out.println("This smartphone is stopped music");
    }
}
