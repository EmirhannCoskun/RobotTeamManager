public class Motor {
    private int id;
    private double motorHizi;
    private boolean motorCalisiyorMu;

    public Motor(int id, double motorHizi, boolean motorCalisiyorMu) {
        this.id = id;
        this.motorHizi = motorHizi;
        this.motorCalisiyorMu = motorCalisiyorMu;
    }

    public int getId() {
        return id;
    }

    public double getMotorHizi() {
        return motorHizi;
    }

    public boolean isCalisiyorMu() {
        return motorCalisiyorMu;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMotorHizi(double motorHizi) {
        if (motorHizi < 0 || motorHizi > 1.0)
            System.out.println("Motor Hızı Geçerli değil.");
        else
            this.motorHizi = motorHizi;
    }

    public void setCalisiyorMu(boolean motorCalisiyorMu) {
        this.motorCalisiyorMu = motorCalisiyorMu;
    }

    public void motoruBaslat() {
        motorCalisiyorMu = true;
    }

    public void motoruDurdur() {
        motorCalisiyorMu = false;
    }
}
