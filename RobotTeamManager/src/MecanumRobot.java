public class MecanumRobot extends Robot {
    private int tekerSayisi;

    public MecanumRobot(String ad, int takimNo, double bataryaLevel, int tekerSayisi) {
        super(ad, takimNo, bataryaLevel);
        this.tekerSayisi = tekerSayisi;
    }

    public void ileriGit() {
        System.out.println("Mecanum robot ileri gidiyor.");
    }

    public void geriyeGit() {
        System.out.println("Mecanum robot geri gidiyor.");
    }

    public void sagaDon() {
        System.out.println("Mecanum robot sağa gidiyor.");
    }

    public void solaDon() {
        System.out.println("Mecanum robot sola gidiyor.");
    }

    @Override
    public void robotBilgiYazdir() {
        super.robotBilgiYazdir();
        System.out.println("Bu Bir Mecanum Robot!");
    }
}
