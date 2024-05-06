// Nama  : Adam Malik
// Nim	 : 13020200051
// Kelas : A2
// Hari/Tanggal : Senin/11-03-2024
// Waktu Pengerjaan : 10 menit

import java.util.Scanner; 
 
/* Baca N, */ 
/* Print i = 1 s/d N dengan while (ringkas) */ 
public class Program14 {  
	/** 
	* @param args 
	*/ 
	public static void main(String[] args) { 
	// TODO Auto-generated method stub 
	/* Kamus : */ 
	int N;
	int i = 1; 
	Scanner masukan=new Scanner(System.in); 
	/* Program */ 
		
	System.out.print ("Nilai N >0 = "); 
	N = masukan.nextInt(); 
	System.out.print ("Print i dengan WHILE (ringkas): \n");
	while (i <= N)
		{ System.out.println (i++); } /* (i > N)*/ 
 
	}
 
}