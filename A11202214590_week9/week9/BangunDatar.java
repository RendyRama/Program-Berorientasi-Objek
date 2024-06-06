package week9;

public class BangunDatar{
    private int sisi;
    private int panjang;
    private int lebar;
    private double diameter;
    private static final double pi = 3.14;

    // cons. persegi
    public BangunDatar(int sisi){
        this.sisi = sisi;
    }
 
    // cons. persegi panjang & segitiga
    public BangunDatar(int panjang, int lebar){
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // cons. lingkaran
    public BangunDatar(double diameter){
        this.diameter = diameter;
    }

    // meth. Persegi
    public int luas(int sisi){
        return sisi*sisi;
    }

    // meth. Panjang
    public int luas(int panjang, int lebar){
        return panjang*lebar;
    }

    // meth. segitiga
    public double luas(double panjang, double lebar){
        return (panjang*lebar)/2;
    }

    // meth. lingkaran
    public double luas(double diameter){
        double r = diameter/2;
        return pi*(r*r);
    }

}