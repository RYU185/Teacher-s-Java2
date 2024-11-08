import java.util.List;

public class Example3 {
    public static void main(String[] args) {

    }
}
// 배열대신 컬렉션중에 하나인 ArrayList를 사용하는 예제
class Album2 {
    private String title;
    private int releaseYear;
    private List<String> tracks; // 원래 문자열의 배열이었던것을 List로 변경

    public Album2() {
    }

    public Album2(String title, int releaseYear, List<String> tracks) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.tracks = tracks;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    @Override
    public String toString() {
        return "앨범제목:" + this.title + ", 발매연도:" + this.releaseYear;
    }
}







