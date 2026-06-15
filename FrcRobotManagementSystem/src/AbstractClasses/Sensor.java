package AbstractClasses;

public abstract class Sensor {
    private int id;
    private String adi;
    private double okunanVeri;

    public Sensor(int id,String adi)
    {
        this.adi = adi;
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public int getId() {
        return id;
    }

    public double getOkunanVeri() {
        return okunanVeri;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setOkunanVeri(double okunanVeri) {
        this.okunanVeri = okunanVeri;
    }

    public abstract void sensoruOku();
    public abstract void veriAl();
}
