public class ArmRobot extends Robot {
    private double kolYuksekligi;
    private boolean gripperVarMi;

    public ArmRobot(String ad, int takimNo, double bataryaLevel, double kolYuksekligi, boolean gripperVarMi) {
        super(ad, takimNo, bataryaLevel);
        this.kolYuksekligi = kolYuksekligi;
        this.gripperVarMi = gripperVarMi;
    }

    public void koluKaldir() {
        System.out.println("Kol kalkıyor.");
    }

    public void koluIndir() {
        System.out.println("Kol iniyor.");
    }

    public void gripperAc() {
        System.out.println("Gripper açılıyor.");
    }

    public void gripperKapa() {
        System.out.println("Gripper kapanıyor.");
    }

    @Override
    public void robotBilgiYazdir() {
        super.robotBilgiYazdir();
        System.out.println("Bu Bir Arm Robot");
    }
}
