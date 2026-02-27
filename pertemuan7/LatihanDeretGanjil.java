/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 27 Februari 2026
*/

package pertemuan7;

public class LatihanDeretGanjil {
    public static void main(String[] args) {
        int angka = 1;
        System.out.println("=== BILANGAN GANJIL 1-15 ===");
        
        while (angka <= 15) {
            if (angka % 2 != 0) {
                System.out.print(angka + " ");
            }
            angka++; 
        }
    }
}