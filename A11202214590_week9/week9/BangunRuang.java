package week9;

public class BangunRuang extends BangunDatar {
    private int tinggi;

    // kubik konstuktor
    public BangunRuang(int sisi) {
        super(sisi);
    }

    // prisma segitiga konstruktor
    public BangunRuang(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    // Tabung konstruktor
    public BangunRuang(double diameter, int tinggi) {
        super(diameter);
        this.tinggi = tinggi;
    }
         
    // kubik
    public int volume(int sisi) {
        int x = super.luas(sisi); // "x =  area/lingkup" untuk memanggil Luas di bangun datar
        return x * sisi;
    }

    // prisma
    public int volume(int panjang, int lebar, int tinggi) {
        int x = super.luas(panjang, lebar);
        return x * tinggi;
    }

    // tabung
    public double volume(double diameter, int tinggi) {
        double x = super.luas(diameter);
        return x * tinggi;
    }
}
