// Nama  : Adam Malik
// Nim	 : 13020200051
// Kelas : A2
// Hari/Tanggal : Senin/11-03-2024
// Waktu Pengerjaan : 10 menit

import java.util.Scanner; 
 
/* Baca N, Print 1 s/d N dengan FOR */ 
public class Program10 { 
	/** 
	* @param args
	*/ 
	public static void main(String[] args) {
	// TODO Auto-generated method stub 
	/* Kamus */ 
	int i,N; 
	Scanner masukan=new Scanner(System.in); 
	/* Program */ 
	/* program */ 
 	System.out.print ("Baca N, print 1 s/d N "); 
 	System.out.print ("N = "); 
 	N=masukan.nextInt(); 
 	for (i = 1; i <= N; i++){ 
 	System.out.println (i); }; 
 	System.out.println ("Akhir program \n"); 

	} 
}