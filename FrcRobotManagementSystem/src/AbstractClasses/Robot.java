package AbstractClasses;

import java.util.ArrayList;

public abstract class Robot {
    private String ad;
    private int id;
    private ArrayList<Motor> motorlar;
    private ArrayList<Sensor> sensorler;

    public Robot(String ad,int id)
    {
        this.ad = ad;
        this.id = id;
        this.motorlar = new ArrayList<>();
        this.sensorler = new ArrayList<>();
    }

    public String getAd() {
        return ad;
    }

    public int getId() {
        return id;
    }

    public ArrayList<Motor> getMotorlar() {
        return motorlar;
    }

    public ArrayList<Sensor> getSensorler() {
        return sensorler;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMotorlar(ArrayList<Motor> motorlar) {
        this.motorlar = motorlar;
    }

    public void setSensorler(ArrayList<Sensor> sensorler) {
        this.sensorler = sensorler;
    }

    public void motorEkle(Motor motor)
    {
        motorlar.add(motor);
        System.out.println("Motor Eklendi");
    }

    public void sensorEkle(Sensor sensor)
    {
        sensorler.add(sensor);
        System.out.println("Sensör Eklendi.");
    }

    public abstract void robotBilgisiYazdir();

}
