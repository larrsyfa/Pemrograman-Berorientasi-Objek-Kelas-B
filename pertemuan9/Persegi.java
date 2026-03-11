/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 11 Maret 2026
*/
package pertemuan9;

public class Persegi {
    int sisi;
    int luas;
    int keliling;

    void hitungLuas() {
        luas = sisi * sisi;
    }

    void hitungKeliling() {
        keliling = 4 * sisi;
    }

    void tampilkanHasil() {
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi : " + sisi + " cm");
        System.out.println("Luas : " + luas + " cm²");
        System.out.println("Keliling: " + keliling + " cm");
    }

    public static void main(String[] args) {
        Persegi p = new Persegi();
        p.sisi = 5;
        p.hitungLuas();
        p.hitungKeliling();
        p.tampilkanHasil();
    }
}