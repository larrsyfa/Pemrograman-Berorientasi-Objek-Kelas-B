/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 26 Februari 2026
*/

package pertemuan5;

public class LatihanDiskon {

    public static void main(String[] args) {

        double totalBelanja = 750000; 
        double diskonPersen;
        double jumlahDiskon;
        double hargaAkhir;

        System.out.println("=== KALKULATOR DISKON ===");
        System.out.println("Total Belanja: Rp " + totalBelanja);

        // buat diskon berdasarkan total belanja
        if (totalBelanja < 100000) {
            diskonPersen = 0;
        } else if (totalBelanja < 500000) {
            diskonPersen = 5;
        } else if (totalBelanja < 1000000) {
            diskonPersen = 10;
        } else {
            diskonPersen = 15;
        }

        // hitung diskon dan harga akhir
        jumlahDiskon = totalBelanja * diskonPersen / 100;
        hargaAkhir = totalBelanja - jumlahDiskon;

        System.out.println("Diskon (" + diskonPersen + "%): Rp " + jumlahDiskon);
        System.out.println("Harga Akhir: Rp " + hargaAkhir);
        System.out.println("Anda hemat: Rp " + jumlahDiskon);
    }
}