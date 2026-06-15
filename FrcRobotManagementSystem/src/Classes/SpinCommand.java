package Classes;

import AbstractClasses.Komut;
import Interfaces.IKomutCalistirabilir;

public class SpinCommand extends Komut implements IKomutCalistirabilir {

    public SpinCommand(String ad)
    {
        super(ad);
    }

    @Override
    public void komutuCalistir()
    {
        System.out.println("Spin komutu çalışıyor.");
    }

    @Override
    public boolean bittiMi()
    {
        if (isBittiMi() == true)
        {
            return true;
        }
        return false;
    }
}
