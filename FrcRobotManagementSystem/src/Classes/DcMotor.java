package Classes;

import AbstractClasses.Motor;
import Interfaces.IMotorKontrol;

public class DcMotor extends Motor implements IMotorKontrol {

    public DcMotor(int id)
    {
        super(id);
    }

    @Override
    public void motoruBaslat() {
        System.out.println("Motor başlatıldı.");
    }

    @Override
    public void motoruDurdur() {
        System.out.println("Motor durduruldu.");
    }

    @Override
    public void hizi(double hiz) {
        System.out.println("Dc Motorun Hızı: " + hiz);
    }
}
