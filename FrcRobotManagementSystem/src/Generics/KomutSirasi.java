package Generics;

import AbstractClasses.Komut;

import java.util.ArrayList;

public class KomutSirasi<T> {
    private ArrayList<T> komutlar;

    public KomutSirasi()
    {
        this.komutlar = new ArrayList<>();
    }

    public ArrayList<T> getKomutlar() {
        return komutlar;
    }

    public void setKomutlar(ArrayList<T> komutlar) {
        this.komutlar = komutlar;
    }

    public void komutEkle(T komut)
    {
        komutlar.add(komut);
    }

    public T komutCikart(T komut)
    {
        komutlar.remove(komut);
        return komut;
    }

    public boolean bosMu()
    {
        if(komutlar.size()==0)
        {
            return true;
        }
        return false;
    }

    public int boyut()
    {
        int boyut =  komutlar.size();
        return boyut;
    }
}
