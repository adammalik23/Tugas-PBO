// Nama  : Adam Malik
// Nim	 : 13020200051
// Kelas : A2

import java.util.Scanner;
public class No2 {

	public static void main(String [] args) {
		// Kamus
		int detik, tdetik, menit, jam;
		Scanner masukkan = new Scanner(System.in);
		// Proses
		System.out.println ("Program Ini Untuk Konversi waktu");

		System.out.print ("Masukkan total detik : ");
		detik = masukkan.nextInt();
		System.out.print   ("\n");
		System.out.println ("Detik Sekarang = " + detik % 60);
		tdetik = + detik % 60;
		System.out.println ("Total Menit    = " + detik / 60);
		System.out.println ("Menit Sekarang = " + detik / 60 % 60);
		menit = + detik / 60 % 60;
		System.out.println ("Total Jam      = " + detik / 60 / 60);
		System.out.println ("Jam Sekarang   = " + detik / 60 / 60 % 24);
		jam = + detik / 60 / 60 % 24;
		System.out.print   ("\n");
		System.out.println ("Jam   = "+ jam );
		System.out.println ("menit = "+ menit );
		System.out.println ("detik = "+ tdetik );
	}
}