package Classes;

import AbstractClasses.Komut;
import Interfaces.IKomutCalistirabilir;

public class MoveCommand extends Komut implements IKomutCalistirabilir {

    public MoveCommand(String ad)
    {
        super(ad);
    }

    @Override
    public void komutuCalistir() {
        System.out.println("Move komutu çalışıyor.");
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
