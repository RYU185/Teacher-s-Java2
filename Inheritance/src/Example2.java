import java.util.Arrays;

public class Example2 {
    public static void main(String[] args) {
        Album album1 = new Album();
        album1.setTitle("Java");
        album1.setReleaseYear(2024);
        System.out.println(album1.toString());

        album1.addTracks("AAA");
        album1.addTracks("BBB");
        album1.addTracks("CCC");
        album1.addTracks("DDD");
        album1.addTracks("EEE");
        album1.addTracks("FFF");
        album1.addTracks("GGG");
        System.out.println(Arrays.toString(album1.getTracks()));
    }
}

class Album {

}
