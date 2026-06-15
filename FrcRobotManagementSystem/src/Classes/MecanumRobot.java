package Classes;

import AbstractClasses.Robot;
import Interfaces.IHareketEdebilir;

public class MecanumRobot extends Robot implements IHareketEdebilir {
    public MecanumRobot(String ad,int id)
    {
        super(ad, id);
    }

    @Override
    public void robotBilgisiYazdir() {
        System.out.println("Mecanum Robot: " + getAd());
    }

    @Override
    public void ileriGit(double hiz) {
        System.out.println("Mecanum Robot İleri gidiyor.");
    }

    @Override
    public void geriyeGit(double hiz) {
        System.out.println("Mecanum Robot Geriye gidiyor.");
    }

    @Override
    public void sagaDon(double hiz) {
        System.out.println("Mecanum Robot Sağa dönüyor.");
    }

    @Override
    public void solaDon(double hiz) {
        System.out.println("Mecanum Robot Sola dönüyor");
    }

    @Override
    public void dur() {
        System.out.println("Mecanum Robot duruyor.");
    }
}
