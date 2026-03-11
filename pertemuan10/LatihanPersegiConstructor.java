/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 11 Maret 2026
*/
package pertemuan10;

class Persegi {
    int sisi;
    int luas;
    int keliling;

    public Persegi(int sisi) {
        if (sisi <= 0) {
            System.out.println("ERROR: Sisi tidak boleh <= 0. Diset ke default (1).");
            this.sisi = 1;
        } else {
            this.sisi = sisi;
        }

        this.luas = this.sisi * this.sisi;
        this.keliling = 4 * this.sisi;
    }

    public void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi : " + sisi + " cm");
        System.out.println("Luas : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm");
        System.out.println();
    }
}

public class LatihanPersegiConstructor {
    public static void main(String[] args) {

        Persegi p1 = new Persegi(5);
        p1.tampilkanHasil();

        Persegi p2 = new Persegi(-3);
        p2.tampilkanHasil();

    }
}