package pbo;

import java.text.DecimalFormat;

public class Volume {

	public static void main(String[] args) {
		System.out.println("Perhitungan Luas Volume tabung:");
		System.out.println("Vol= phi x (r x r) x tinggi");
		System.out.println("Diameter= 5");
		float diameter = 5;
		float r = diameter/2;
		System.out.println("r= ");
		System.out.print(r);

		
		System.out.println("Vol= 3.14 x (2.5 x 2.5) x 10");
		float phi = 3.14f;
		float tinggi = 10;
		float hasil = phi*(r*r)*tinggi;
		
		DecimalFormat df = new DecimalFormat("#.###");
		System.out.print("jadi, hasil = ");
		System.out.print(df.format(hasil));
	}
}
