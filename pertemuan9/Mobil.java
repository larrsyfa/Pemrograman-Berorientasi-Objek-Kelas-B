/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 11 Maret 2026
*/
package pertemuan9;

public class Mobil {
    String merk;
    String warna;
    int tahun;
    int kecepatan = 0;

    void tampilkanSpesifikasi() {
        System.out.println("=== SPESIFIKASI MOBIL ===");
        System.out.println("Merk : " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
        System.out.println();
    }

    void percepat() {
        kecepatan = kecepatan + 20;
        System.out.println("Mobil dipercepat...");
    }

    void tampilkanKecepatan() {
        System.out.println("Kecepatan saat ini: " + kecepatan + " km/jam");
    }

    public static void main(String[] args) {

        Mobil mobil1 = new Mobil();
        mobil1.merk = "Toyota Avanza";
        mobil1.warna = "Silver";
        mobil1.tahun = 2020;

        mobil1.tampilkanSpesifikasi();
        mobil1.percepat();
        mobil1.percepat();
        mobil1.tampilkanKecepatan();
    }
}