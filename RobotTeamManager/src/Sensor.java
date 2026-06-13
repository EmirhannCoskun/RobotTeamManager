public class Sensor {
    private String sensorTuru;
    private double okunanDeger;
    private boolean sensorAktifMi;

    public Sensor(String sensorTuru, double okunanDeger, boolean sensorAktifMi) {
        this.sensorTuru = sensorTuru;
        this.okunanDeger = okunanDeger;
        this.sensorAktifMi = sensorAktifMi;
    }

    public String getSensorTuru() {
        return sensorTuru;
    }

    public double getOkunanDeger() {
        return okunanDeger;
    }

    public boolean isSensorAktifMi() {
        return sensorAktifMi;
    }

    public void setSensorTuru(String sensorTuru) {
        this.sensorTuru = sensorTuru;
    }

    public void setOkunanDeger(double okunanDeger) {
        this.okunanDeger = okunanDeger;
    }

    public void setSensorAktifMi(boolean sensorAktifMi) {
        this.sensorAktifMi = sensorAktifMi;
    }

    public void sensorOku() {
        System.out.println("Sensör okuması: " + okunanDeger);
    }
}
