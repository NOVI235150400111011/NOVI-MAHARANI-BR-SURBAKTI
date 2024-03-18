// TUGAS 2 PEMROGRAMAN LANJUT SI A
// Nama : NOVI MAHARANI BR SURBAKTI
// NIM  : 235150400111011

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private String alamat;

    // Konstruktor
    public Mahasiswa(String nim, String nama,String prodi, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.alamat = alamat;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void tampilkanInfo() {
        System.out.println(nim + " | " + nama + " | "+ prodi + " | " + alamat);
    }
}