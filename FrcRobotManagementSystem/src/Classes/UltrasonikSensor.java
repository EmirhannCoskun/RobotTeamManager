package Classes;

import AbstractClasses.Robot;
import AbstractClasses.Sensor;
import Interfaces.ISensorOkuyabilir;

public class UltrasonikSensor extends Sensor implements ISensorOkuyabilir {

    public UltrasonikSensor(int id,String adi)
    {
        super(id, adi);
    }

    @Override
    public void sensoruOku() {
        System.out.println("Sensör Türü: Ultrasonik Kamera | Okunan Değer: " + getOkunanVeri());
    }

    @Override
    public void veriAl() {
        System.out.println("Sensörde okunan değer: " + Math.random() * 400);
    }


}
