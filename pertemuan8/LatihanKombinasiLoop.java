/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 27 Februari 2026
referensi yang sempat saya gunakan 
https://medium.com/@iamthatsoftwareguy/understanding-break-continue-and-labeled-statements-in-java-loops-8bdfa932c28a
*/

package pertemuan8;

public class LatihanKombinasiLoop {

    public static void main(String[] args) {

        System.out.println("=== PENCARIAN KOORDINAT [2,3] ===");

        pencarian: // label break
        for (int baris = 1; baris <= 3; baris++) {
            for (int kolom = 1; kolom <= 5; kolom++) {

                System.out.println("Cek: [" + baris + "," + kolom + "]");

                if (baris == 2 && kolom == 3) {
                    break pencarian; // label biar ga keluar 1 loop saja
                }
            }
        }
        System.out.println("✓ Koordinat ditemukan!");
        System.out.println("Pencarian selesai.");
    }
}
