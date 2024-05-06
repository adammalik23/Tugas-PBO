// Nama  : Adam Malik
// Nim	 : 13020200051
// Kelas : A2
// Hari/Tanggal : Senin/11-03-2024
// Waktu Pengerjaan : 10 menit

import java.util.Scanner;

/**
 * This class iterates from 1 to a user-provided integer and prints each value.
 */
public class Program11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Create Scanner object

        System.out.print("Enter a positive integer: ");

        // Input validation to ensure a positive integer is entered
        int N;
        do {
            N = scanner.nextInt();
        } while (N <= 0);

        System.out.println("Print i with ITERATE:");

        // Use a for loop for clearer structure and termination condition
        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }

        scanner.close();  // Close the Scanner to avoid resource leaks
    }
}
