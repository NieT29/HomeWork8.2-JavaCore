public class Song {
    private int IdSong;
    private String nameSong;
    private String singer;

    public Song(int idSong, String nameSong, String singer) {
        IdSong = idSong;
        this.nameSong = nameSong;
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Song{" +
                "IdSong=" + IdSong +
                ", nameSong='" + nameSong + '\'' +
                ", singer='" + singer + '\'' +
                '}';
    }
}
