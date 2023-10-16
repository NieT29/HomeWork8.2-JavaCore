import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập số lượng idol ");
        int numberOfIdols = Integer.parseInt(scanner.nextLine());
        ArrayList<Idol> idols = new ArrayList<>();
        for (int i = 0; i < numberOfIdols; i++) {
            System.out.println("Nhập id Idol thứ "+(i+1));
            int idIdol = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tên Idol thứ "+(i+1));
            String nameIdol = scanner.nextLine();
            System.out.println("Nhập email Idol thứ "+(i+1));
            String emailIdol = scanner.nextLine();
            System.out.println("Nhập tên nhóm của Idol thứ "+(i+1));
            String groupIdol = scanner.nextLine();

            System.out.println("Nhập số người theo dõi");
            int numberOfFollowers = Integer.parseInt(scanner.nextLine());
            ArrayList<Follower> followers = new ArrayList<>();
            for (int j = 0; j <numberOfFollowers ; j++) {
                System.out.println("Nhập id người theo dõi thứ "+(j+1));
                int idFollower = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập tên người theo dõi thứ "+(j+1));
                String nameFollower = scanner.nextLine();
                System.out.println("Nhập email người theo dõi thứ "+(j+1));
                String emailFollower = scanner.nextLine();
                System.out.println("Nhập số lượng like của người theo dõi thứ "+(j+1));
                int numberOfLike = Integer.parseInt(scanner.nextLine());

                Follower follower = new Follower(idFollower,nameFollower,emailFollower,numberOfLike);
                followers.add(follower);
            }
            Idol idol = new Idol(idIdol,nameIdol,emailIdol,groupIdol,followers);
            idols.add(idol);
        }

        System.out.println("Nhập số lượng bài hát ");
        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        ArrayList<Song> songs = new ArrayList<>();
        for (int i = 0; i < numberOfSongs; i++) {
            System.out.println("Nhập id bài hát thứ "+(i+1));
            int idSong = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhập tên bài hát thứ "+(i+1));
            String nameSong = scanner.nextLine();
            System.out.println("Nhập tên ca sỹ bài hát thứ "+(i+1));
            String singer = scanner.nextLine();

            Song song = new Song(idSong,nameSong,singer);
            songs.add(song);
        }

        Tiktok tiktok = new Tiktok(idols,songs);
        System.out.println(tiktok);
    }
}
