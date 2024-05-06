/* 13020200051, Adam Malik, Jum'at/23-02-2024, 22.40 */

/* pembagian integer casting */

import javax.swing.text.Style;

public class Tugas9 {
    public static void main(String[] args) {
        //TODO Auto-generated method stub
        /*KAMUS */
        int x =1; int y = 2; float fx; float fy;

        /* ALGORITMA */

        System.out.print("x/y (format integer) = "+x/y);
        System.out.print("\n x/y (format float) = "+x/y);
        /*supaya hasilnya tidak nol */
        fx=x;
        fy=y;

        System.out.print("\n x/y (format integer) = "+fx/fy);
        System.out.print("\n x/y (format float) =  "+fx/fy);
        /*casting */
        System.out.print("\n float (x) / float (y) (format integer) = "+ (float)x / (float)y);
        System.out.print("\n float (x) / float (y) (format float) = "+ (float)x / (float)y);
        x = 10; y = 3;
        System.out.print("\n x/y (format integer) = "+x/y);
        System.out.print("\n x/y (format float) = "+x/y);
    }
}