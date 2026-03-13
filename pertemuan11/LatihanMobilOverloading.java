/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 13 Maret 2026
*/
package pertemuan11;

public class LatihanMobilOverloading {

    static class Mobil {
        String merk;
        String warna;
        int tahun;

        // constructor 1 tanpa parameter
        public Mobil() {
            merk = "Unknown";
            warna = "Unknown";
            tahun = 0;
        }

        // constructor 2 buat merk
        public Mobil(String merk) {
            this.merk = merk;
            this.warna = "Unknown";
            this.tahun = 0;
        }

        // constructor 3 semua atribut
        public Mobil(String merk, String warna, int tahun) {
            this.merk = merk;
            this.warna = warna;
            this.tahun = tahun;
        }

        public void tampilkanSpesifikasi() {
            System.out.println("=== SPESIFIKASI MOBIL ===");
            System.out.println("Merk : " + merk);
            System.out.println("Warna: " + warna);
            System.out.println("Tahun: " + tahun);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Mobil mobil1 = new Mobil(); 
        Mobil mobil2 = new Mobil("Toyota"); 
        Mobil mobil3 = new Mobil("Honda Civic", "Merah", 2023); 
        
        mobil1.tampilkanSpesifikasi();
        mobil2.tampilkanSpesifikasi();
        mobil3.tampilkanSpesifikasi();
    }
}