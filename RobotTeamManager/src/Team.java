import java.util.ArrayList;

public class Team {
    private String teamName;
    private int teamNo;

    ArrayList<Robot> robotlar = new ArrayList<>();
    ArrayList<Oyuncu> oyuncular = new ArrayList<>();

    public Team(String teamName, int teamNo) {
        this.teamName = teamName;
        this.teamNo = teamNo;
    }

    public void robotEkle(Robot r) {
        robotlar.add(r);
    }

    public void oyuncuEkle(Oyuncu o) {
        oyuncular.add(o);
    }

    public void takimBilgisiYazdir() {
        System.out.println("Takım Adı: " + teamName + " Takım No: " + teamNo);
        for (Robot robot : robotlar) {
            robot.robotBilgiYazdir();
        }
        for (Oyuncu oyuncu : oyuncular) {
            oyuncu.oyuncuBilgisiYazdir();
        }
    }
}