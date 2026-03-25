/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 25 Maret 2026
*/

package pertemuan15;

public class LatihanMethodVarArgs {

    // method varargs untuk menghitung rata-rata
    static double hitungRataRata(int... nilai) {
        int total = 0;

        // total dengan enhanced for
        for (int n : nilai) {
            total += n;
        }

        // mengembalikan rata-rata
        return (double) total / nilai.length;
    }

    public static void main(String[] args) {
        System.out.println("Rata-rata (3 nilai): " + hitungRataRata(70, 80, 90)); // dengan 3 nilai
        System.out.println("Rata-rata (5 nilai): " + hitungRataRata(80, 85, 90, 87, 88));  // dengan 5 nilai
    }
}