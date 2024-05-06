// Nama  : Adam Malik
// Nim	 : 13020200051
// Kelas : A2
// Hari/Tanggal : Senin/11-03-2024
// Waktu Pengerjaan : 10 menit

import java.util.Scanner; 
 
/* contoh pemakaian IF tiga kasus */ /* Membaca sebuah nilai, */ 
/* menuliskan 'Nilai a positif , nilai a', jika a >0 */ 
/* 'Nilai Nol , nilai a', jika a = 0 */ 
/* 'Nilai a negatif , nilai a', jika a <0 */ 

public class Program5 { 
	/** 
	* @param args 
	*/ 
	public static void main(String[] args) { 
	// TODO Auto-generated method stub 
	/* Kamus */ 
	int a; 
	Scanner masukan=new Scanner(System.in); 
 
	/* Program */ 
	System.out.print ("Contoh IF tiga kasus \n"); 
	System.out.print ("Ketikkan suatu nilai integer :"); 
	a=masukan.nextInt(); 
	if (a > 0){ 
	System.out.println ("Nilai a positif "+ a); 
	}else if (a == 0){ 
	System.out.println ("Nilai Nol "+ a); 
	}else /* a > 0 */ { 
	System.out.println ("Nilai a negatif "+ a);} 

	} 
 
} 