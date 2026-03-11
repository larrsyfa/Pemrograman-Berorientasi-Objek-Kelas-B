/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 11 Maret 2026
*/
package pertemuan10;

public class LatihanBukuConstructor {
    static class Buku {
        String judul;
        String pengarang;
        int harga;

        // constructor 1 tanpa parameter
        public Buku() {
            judul = "Belum diisi";
            pengarang = "Belum diisi";
            harga = 0;
        }

        // constructor 2 dengan parameter
        public Buku(String judul, String pengarang, int harga) {
            this.judul = judul;
            this.pengarang = pengarang;
            this.harga = harga;
        }

        public void tampilkanInfo() {
            System.out.println("=== INFORMASI BUKU ===");
            System.out.println("Judul : " + judul);
            System.out.println("Pengarang: " + pengarang);
            System.out.println("Harga : Rp " + harga);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        // untuk default
        Buku buku1 = new Buku();

        // untuk parameter
        Buku buku2 = new Buku("Pemrograman Java", "Budi Raharjo", 125000);
        Buku buku3 = new Buku("Algoritma dan Struktur Data", "Rinaldi Munir", 150000);

        buku1.tampilkanInfo();
        buku2.tampilkanInfo();
        buku3.tampilkanInfo();
    }
}