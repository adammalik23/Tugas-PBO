// Nama  : Adam Malik
// Nim	 : 13020200051
// Kelas : A2

import javax.swing.*;
public class Input3 {
    public static void main(String[] args) {
        String Nama = JOptionPane.showInputDialog("Masukkan Nama     : ");
        String Nim = JOptionPane.showInputDialog("Masukkan Nim      : ");
        String Jurusan = JOptionPane.showInputDialog("Masukkan Jurusan  : ");
        String Fakultas = JOptionPane.showInputDialog("Masukkan Fakultas : ");
        System.out.println("\n");
        System.out.println("Nama     : " + Nama);
        System.out.println("Nim      : " + Nim);
        System.out.println("Jurusan  : " + Jurusan);
        System.out.println("Fakultas : " + Fakultas);
    }
}