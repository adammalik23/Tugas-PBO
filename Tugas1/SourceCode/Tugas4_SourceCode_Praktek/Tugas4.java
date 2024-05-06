/* 13020200051, Adam Malik, Jum'at/23-02-2024, 22.40 */

import java.util.Scanner;
/* contoh membaca integer menggunakan Class Scanner */
public class Tugas4 {
	/**
	 * @param args
	 */
	public static void main (String [] args) {
		// TODO Auto-generated method stub
		/* KAMUS */
		int a;
		Scanner masukan;
		/* Program */
		System.out.println ("Contoh membaca dan menulis, ketik nilai integer: \n");
		masukan = new Scanner(System.in);
		a = masukan.nextInt(); /* coba ketik : apa akibatnya ? */
		System.out.println ("Nilai yang dibaca : "+ a);
	}
}