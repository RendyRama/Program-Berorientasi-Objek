package week9;

public class Main{
    public static void main(String[] args){
        BangunDatar dtr = new BangunDatar(0);
        BangunRuang rng = new BangunRuang(0,0);

        System.out.println("=======Bangun Datar========");
        System.out.println("Luas: " + dtr.luas(2));
        System.out.println("Luas: " + dtr.luas(4, 5));
        System.out.println("Luas: " + dtr.luas(12.0, 3.0) );
        System.out.println("=======Bangun Ruang========");
        System.out.println("Luas Kotak: " + rng.volume(3));
        System.out.println("Luas Balok: " + rng.volume(2,4,6));
        System.out.println("Luas Tabung: " + rng.volume(5.0, 6));
        
    }
}