package Classes;

import AbstractClasses.Sensor;
import Interfaces.ISensorOkuyabilir;

import java.util.Random;

public class Kamera extends Sensor implements ISensorOkuyabilir {

    public Kamera(int id,String adi)
    {
        super(id, adi);
    }

    @Override
    public void sensoruOku() {
        System.out.println("Sensör Türü: Kamera | Okunan Değer: " + getOkunanVeri());
    }

    @Override
    public void veriAl() {
        System.out.println("Kamerada okunan değer: " + Math.random() * 400);
    }

}
