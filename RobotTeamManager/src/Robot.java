import java.util.ArrayList;

public class Robot {
    private String ad;
    private int takimNo;
    private double bataryaLevel;

    ArrayList<Motor> motorlar = new ArrayList<>();
    ArrayList<Sensor> sensorler = new ArrayList<>();

    public Robot(String ad, int takimNo, double bataryaLevel) {
        this.ad = ad;
        this.takimNo = takimNo;
        this.bataryaLevel = bataryaLevel;
    }

    public void motorEkle(Motor m) {
        motorlar.add(m);
    }

    public void sensorEkle(Sensor s) {
        sensorler.add(s);
    }

    public void bataryaKontrol() {
        if (bataryaLevel < 0 || bataryaLevel > 100) {
            System.out.println("Batarya seviyesi 0-100 aralığında olmalıdır.");
        } else if (bataryaLevel < 20) {
            System.out.println("Batarya düşük!");
        } else {
            System.out.println("Batarya yeterli seviyede");
        }
    }

    public void robotBilgiYazdir() {
        System.out.println("Robot Adı: " + ad + " Numarası: " + takimNo + " Batarya Seviyesi: " + bataryaLevel + " Motor Sayısı: " + motorlar.size() + " Sensör Sayısı: " + sensorler.size());
    }
}
