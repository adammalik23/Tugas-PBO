// Nama  : Adam Malik
// Nim	 : 13020200051
// Kelas : A2
// Hari/Tanggal : Senin/11-03-2024
// Waktu Pengerjaan : 10 menit

import java.util.Scanner;

public class Program12 { 
	/** 
	* @param args 
	*/ 
	public static void main(String[] args) {
	// TODO Auto-generated method stub 
	/* Kamus : */
	int N; 
	int i; 
	Scanner masukan=new Scanner(System.in); 
	/* Program */ 
	System.out.print ("Nilai N >0 = "); 
	/* Inisialisasi */ 
	N = masukan.nextInt(); 
	i = 1; 
	/* First Elmt */ 
	System.out.print ("Print i dengan REPEAT: \n"); 
	do { 
		System.out.print (i+"\n"); /* Proses */ i++; /* Next Elmt */ } 
	while (i <= N); /* Kondisi pengulangan */ 

	} 
} 