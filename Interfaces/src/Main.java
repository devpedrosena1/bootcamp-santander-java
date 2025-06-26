public class Main {

    public static void main(String[] args) {

//        MusicPlayer musicPlayer = new MusicPlayer() {
//            @Override
//            public void playMusic() {
//                System.out.println("Playing music");
//            }
//
//            @Override
//            public void pauseMusic() {
//                System.out.println("Pausing music");
//            }
//
//            @Override
//            public void stopMusic() {
//                System.out.println("Stopping music");
//            }
//        };
//        musicPlayer.playMusic();
//        musicPlayer.pauseMusic();
//        musicPlayer.stopMusic();

        Computer musicPlayer = new Computer();
        runMusic(musicPlayer);
        runVideo(musicPlayer);
        // runVideo(((VideoPlayer) musicPlayer)); -> casting

    }

    public static void runVideo(VideoPlayer videoPlayer) {
        videoPlayer.playVideo();
    }

    public static void runMusic(MusicPlayer musicPlayer) {
        musicPlayer.playMusic();
    }

}
