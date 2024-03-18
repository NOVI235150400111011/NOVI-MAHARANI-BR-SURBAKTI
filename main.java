// TUGAS 2 PEMROGRAMAN LANJUT SI A
// Nama : NOVI MAHARANI BR SURBAKTI
// NIM  : 235150400111011

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] a) {
        //menyimpan objek mahasiswa
        ArrayList<Mahasiswa> mahasiswaBaru = new ArrayList<>(); 

        // Scanner pembaca input dari terminal
        Scanner scanner = new Scanner(System.in); 
        boolean next = true;
        while (next) {
            System.out.print("masukkan nim : ");
            String nim = scanner.nextLine();

            System.out.print("masukkan nama : ");
            String nama = scanner.nextLine();

            System.out.print("masukkan prodi : ");
            String prodi = scanner.nextLine();


            System.out.print("masukkan alamat: ");
            String alamat = scanner.nextLine();

            // objek Mahasiswa baru 
            Mahasiswa mahasiswa = new Mahasiswa(nim, nama,prodi, alamat);
            mahasiswaBaru.add(mahasiswa);

            System.out.print("tambah data mahasiswa lagi? (YA/TIDAK) ");
            String tambah = scanner.nextLine();

            // Cek penambahan data
            if (tambah.equals("TIDAK")) {
                next = false; 
            }
        }

        scanner.close();

        System.out.println("DATA MAHASISWA UNIVERSITAS BRAWIJAYA");
        System.out.println("====================================");
        // Menampilkan informasi 
        for (Mahasiswa mahasiswa : mahasiswaBaru) {
            mahasiswa.tampilkanInfo();
        }
    }
}