package Classes;

import AbstractClasses.Robot;
import Interfaces.IHareketEdebilir;

public class ArmRobot extends Robot implements IHareketEdebilir {
    public ArmRobot(String ad,int id)
    {
        super(ad, id);
    }

    @Override
    public void robotBilgisiYazdir() {
        System.out.println("Arm Robot: " + getAd());
    }

    @Override
    public void ileriGit(double hiz) {
        System.out.println("Arm Robot İleri gidiyor.");
    }

    @Override
    public void geriyeGit(double hiz) {
        System.out.println("Arm Robot Geriye gidiyor.");
    }

    @Override
    public void sagaDon(double hiz) {
        System.out.println("Arm Robot Sağa dönüyor.");
    }

    @Override
    public void solaDon(double hiz) {
        System.out.println("Arm Robot Sola dönüyor");
    }

    @Override
    public void dur() {
        System.out.println("Arm Robot duruyor.");
    }
}
