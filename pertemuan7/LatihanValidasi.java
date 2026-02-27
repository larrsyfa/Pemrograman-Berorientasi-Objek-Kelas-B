/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 27 Februari 2026
*/

package pertemuan7; 

public class LatihanValidasi {
    public static void main(String[] args) {

        System.out.println("=== VALIDASI NILAI UJIAN ===\n");
        int[] percobaan = {-10, 150, 85};
        int i = 0;
        int nilai;

        do {
            nilai = percobaan[i];
            System.out.println("Percobaan input: " + nilai);

            if (nilai < 0 || nilai > 100) {
                System.out.println("Error: Nilai harus antara 0-100!\n");
            } else {
                System.out.println("✓ Nilai valid: " + nilai); // tanda "✓" saat keluar ouput jadi "?"
            }
            i++;
        } while (nilai < 0 || nilai > 100);

    }
}