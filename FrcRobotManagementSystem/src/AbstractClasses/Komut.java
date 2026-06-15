package AbstractClasses;

public abstract class Komut {
    private String ad;
    private boolean baslandiMi;
    private boolean bittiMi;

    public Komut(String ad)
    {
        this.ad = ad;
    }

    public String getAd() {
        return ad;
    }

    public boolean isBaslandiMi() {
        return baslandiMi;
    }

    public boolean isBittiMi() {
        return bittiMi;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public void setBaslandiMi(boolean baslandiMi) {
        this.baslandiMi = baslandiMi;
    }

    public void setBittiMi(boolean bittiMi) {
        this.bittiMi = bittiMi;
    }

    public abstract void komutuCalistir();
}
