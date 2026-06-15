package AbstractClasses;

public abstract class Motor {
    private int id;
    private double hizi;
    private boolean calisiyorMu;

    public Motor(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public double getHizi() {
        return hizi;
    }

    public boolean isCalisiyorMu() {
        return calisiyorMu;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setHizi(double hizi) {
        this.hizi = hizi;
    }

    public void setCalisiyorMu(boolean calisiyorMu) {
        this.calisiyorMu = calisiyorMu;
    }

    public abstract void motoruBaslat();
    public abstract void motoruDurdur();
    public abstract void hizi(double hiz);
}
