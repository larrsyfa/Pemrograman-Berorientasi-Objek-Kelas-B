/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 13 Maret 2026
*/
package pertemuan11;

class Produk {
    String namaProduk;
    int harga;
    int stok;

    // nama dan harga 
    Produk(String namaProduk, int harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = 0; 
    }

    // nama, harga, dan stok
    Produk(String namaProduk, int harga, int stok) {
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanInfo() {
        System.out.println("=== INFORMASI PRODUK ===");
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga       : Rp " + harga);
        System.out.println("Stok        : " + stok);
        System.out.println();
    }
}

public class LatihanProdukOverloading {
    public static void main(String[] args) {
        Produk produk1 = new Produk("Laptop ASUS", 8500000);
        Produk produk2 = new Produk("Mouse Logitech", 250000, 50);

        produk1.tampilkanInfo();
        produk2.tampilkanInfo();
    }
}