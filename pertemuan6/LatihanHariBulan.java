/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 27 Februari 2026
*/

package pertemuan6;

public class LatihanHariBulan {

    public static void main(String[] args) {

        int month = 4; 
        String namaBulan = ""; // buat string kosong
        int jumlahHari = 0;
        System.out.println("=== JUMLAH HARI DALAM BULAN ===");

        switch (month) { // buat 31 hari
            case 1:
                namaBulan = "Januari";
            case 3:
                if (month == 3) namaBulan = "Maret";
            case 5:
                if (month == 5) namaBulan = "Mei";
            case 7:
                if (month == 7) namaBulan = "Juli";
            case 8:
                if (month == 8) namaBulan = "Agustus";
            case 10:
                if (month == 10) namaBulan = "Oktober";
            case 12:
                if (month == 12) namaBulan = "Desember";
                if (month == 1 || month == 3 || month == 5 || month == 7 ||
                    month == 8 || month == 10 || month == 12) {
                    jumlahHari = 31;
                    break;
                }

            case 4:  // 30 hari
                namaBulan = "April";
            case 6:
                if (month == 6) namaBulan = "Juni";
            case 9:
                if (month == 9) namaBulan = "September";
            case 11:
                if (month == 11) namaBulan = "November";
                if (month == 4 || month == 6 || month == 9 || month == 11) {
                    jumlahHari = 30;
                    break;
                }

            case 2: // buat februari
                namaBulan = "Februari";
                jumlahHari = 28;
                break;

            default:
                System.out.println("Error: Bulan tidak valid (1-12)");
                return;
        }
        System.out.println("Bulan: " + namaBulan + " (bulan ke-" + month + ")");
        System.out.println("Jumlah hari: " + jumlahHari + " hari");
    }
}