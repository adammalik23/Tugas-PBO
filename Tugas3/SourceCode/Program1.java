// Nama  : Adam Malik
// Nim	 : 13020200051
// Kelas : A2
// Hari/Tanggal : Senin/11-03-2024
// Waktu Pengerjaan : 10 menit

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
 
import javax.swing.*; 
public class Program1 {
	/** 
	* @param args 
	* @throws IOException */
	public static void main(String[] args) throws IOException { 
	// TODO Auto-generated method stub 
	/* Kamus */ 
	String str; 
 
	BufferedReader datAIn = new BufferedReader(new 
	InputStreamReader(System.in)); 
	/* Program */ 
 
	System.out.print ("\nBaca string dan Integer: \n"); 
	System.out.print("masukkan sebuah string: "); 
	str= datAIn.readLine(); 
 
	System.out.print ("String yang dibaca : "+ str); 
 
	} 
 
}