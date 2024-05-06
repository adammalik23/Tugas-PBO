// Nama  : Adam Malik
// Nim	 : 13020200051
// Kelas : A2

import java.util.Scanner;
public class No1 {

	public static void main(String [] args) {
		/* Kamus */
		String nim, nama, jurusan, fakultas;
		Scanner masukkan = new Scanner(System.in);
		/* Program */
		System.out.print("Masukkan Nim, Nama, Jurusan dan Fakultas : \n");
		System.out.print("\n");
		System.out.print("Masukkan Nim Anda 	 : ");
		nim = masukkan.nextLine();
		System.out.print("Masukkan Nama Anda 	 : ");
		nama = masukkan.nextLine();
		System.out.print("Masukkan Jurusan Anda    : ");
		jurusan = masukkan.nextLine();
		System.out.print("Masukkan Fakultas Anda   : ");
		fakultas = masukkan.nextLine();
		System.out.println("\n");
		System.out.println("Nim 	 : "+ nim);
		System.out.println("Nama     : "+ nama);
		System.out.println("Jurusan  : "+ jurusan);
		System.out.println("Fakultas : "+ fakultas);
	}
}