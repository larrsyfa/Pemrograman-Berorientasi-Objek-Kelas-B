/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 27 Februari 2026
*/

package pertemuan6;

public class LatihanRestoran {

    public static void main(String[] args) {

        int menuCode = 1; 
        int quantity = 2; 
        String namaMenu = ""; // buat string kosong
        int harga = 0;
        int total;

        System.out.println("=== MENU RESTORAN ===");
        System.out.println("Kode Menu: " + menuCode);
        System.out.println("Jumlah: " + quantity);
        System.out.println();

        switch (menuCode) {
            case 1:
                namaMenu = "Nasi Goreng";
                harga = 15000;
                break;
            case 2:
                namaMenu = "Mie Ayam";
                harga = 12000;
                break;
            case 3:
                namaMenu = "Bakso";
                harga = 10000;
                break;
            case 4:
                namaMenu = "Soto Ayam";
                harga = 13000;
                break;
            case 5:
                namaMenu = "Es Teh";
                harga = 3000;
                break;
            default:
                System.out.println("Menu tidak tersedia!");
                return;
        }

        total = harga * quantity;
        System.out.println("Pesanan Anda:");
        System.out.println("Nama Menu: " + namaMenu);
        System.out.println("Harga Satuan: Rp " + harga);
        System.out.println("Jumlah: " + quantity);
        System.out.println("---");
        System.out.println("Total Bayar: Rp " + total);
    }
}