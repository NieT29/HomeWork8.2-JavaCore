public class Follower {
    private int idFollower;
    private String nameFollower;
    private String emailFollower;
    private int numberOfLike;

    public Follower(int idFollower, String nameFollower, String emailFollower, int numberOfLike) {
        this.idFollower = idFollower;
        this.nameFollower = nameFollower;
        this.emailFollower = emailFollower;
        this.numberOfLike = numberOfLike;
    }

    @Override
    public String toString() {
        return "Follower{" +
                "idFollower=" + idFollower +
                ", nameFollower='" + nameFollower + '\'' +
                ", emailFollower='" + emailFollower + '\'' +
                ", numberOfLike=" + numberOfLike +
                '}';
    }
}
