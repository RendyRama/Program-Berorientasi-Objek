package pbo;

import java.text.DecimalFormat;

public class KLingkaran {

	public static void main(String[] args) {
		System.out.println("Perhitungan Keliling Lingkaran:");
		System.out.println("KL= phi x diameter");
		System.out.println("KL= 3.14 x 10");
		float phi = 3.14f;
		float diameter = 10;
		float hasil = phi * diameter;
		
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.print("jadi, hasil = ");
		System.out.print(df.format(hasil));
	}
}