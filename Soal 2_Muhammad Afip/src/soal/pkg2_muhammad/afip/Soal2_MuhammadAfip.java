/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package soal.pkg2_muhammad.afip;
import java.util.Scanner;
/**
 *
 * @author acer
 */
public class Soal2_MuhammadAfip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Membuat objek Scanner untuk input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna memasukkan nama
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        // Meminta pengguna memasukkan usia
        System.out.print("Masukkan usia Anda: ");
        int usia = scanner.nextInt();

        // Meminta pengguna memasukkan tinggi badan
        System.out.print("Masukkan tinggi badan Anda (dalam meter): ");
        double tinggiBadan = scanner.nextDouble();

        // Menampilkan hasil input
        System.out.println("Nama: " + nama);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Tinggi Badan: " + tinggiBadan + " meter");

        // Menutup objek Scanner
        scanner.close();
    }
}
