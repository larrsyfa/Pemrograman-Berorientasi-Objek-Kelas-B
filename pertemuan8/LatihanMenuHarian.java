/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 27 Februari 2026
*/

package pertemuan8;

public class LatihanMenuHarian {

    public static void main(String[] args) {

        System.out.println("=== MENU MAKAN 3 HARI ===");

        for (int hari = 1; hari <= 3; hari++) {
            System.out.println("Hari " + hari + ":");

            for (int waktu = 1; waktu <= 2; waktu++) {
                String menu = "";

                if (hari == 1) {
                    if (waktu == 1) {
                        menu = "Nasi Goreng";
                        System.out.println("    Pagi: " + menu);
                    } else {
                        menu = "Soto Ayam";
                        System.out.println("    Siang: " + menu);
                    }
                }

                else if (hari == 2) {
                    if (waktu == 1) {
                        menu = "Bubur Ayam";
                        System.out.println("    Pagi: " + menu);
                    } else {
                        menu = "Mie Goreng";
                        System.out.println("    Siang: " + menu);
                    }
                }

                else if (hari == 3) {
                    if (waktu == 1) {
                        menu = "Roti Bakar";
                        System.out.println("    Pagi: " + menu);
                    } else {
                        menu = "Nasi Uduk";
                        System.out.println("    Siang: " + menu);
                    }
                }
            }
            System.out.println();
        }
    }
}
