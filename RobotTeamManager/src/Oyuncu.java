public class Oyuncu {
    private String oyuncuAd;
    private int numara;
    private String rol;

    public Oyuncu(String oyuncuAd, int numara, String rol) {
        this.oyuncuAd = oyuncuAd;
        this.numara = numara;
        this.rol = rol;
    }

    public String getOyuncuAd() {
        return oyuncuAd;
    }

    public int getNumara() {
        return numara;
    }

    public String getRol() {
        return rol;
    }

    public void setOyuncuAd(String oyuncuAd) {
        this.oyuncuAd = oyuncuAd;
    }

    public void setNumara(int numara) {
        this.numara = numara;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public void oyuncuBilgisiYazdir() {
        System.out.println("Oyuncunun Adı: " + oyuncuAd + " Numarası: " + numara + " Rolü: " + rol);
    }
}
