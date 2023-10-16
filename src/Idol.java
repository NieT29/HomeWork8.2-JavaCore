import java.util.ArrayList;

public class Idol {
    private int idIdol;
    private String nameIdol;
    private String emailIdol;
    private String groupIdol;
    private ArrayList<Follower> followers;

    public Idol(int idIdol, String nameIdol, String emailIdol, String groupIdol, ArrayList<Follower> followers) {
        this.idIdol = idIdol;
        this.nameIdol = nameIdol;
        this.emailIdol = emailIdol;
        this.groupIdol = groupIdol;
        this.followers = followers;
    }

    @Override
    public String toString() {
        return "Idol{" +
                "idIdol=" + idIdol +
                ", nameIdol='" + nameIdol + '\'' +
                ", emailIdol='" + emailIdol + '\'' +
                ", groupIdol='" + groupIdol + '\'' +
                ", followers=" + followers +
                '}';
    }
}
