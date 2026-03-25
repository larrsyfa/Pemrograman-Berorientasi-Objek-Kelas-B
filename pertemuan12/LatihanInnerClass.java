/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 25 Maret 2026
*/

package pertemuan12;

public class LatihanInnerClass {
    static class Sekolah {
        String namaSekolah;

        // Constructor Sekolah
        Sekolah(String namaSekolah) {
            this.namaSekolah = namaSekolah;
        }

        class Kelas { // Inner class
            String namaKelas;

            Kelas(String namaKelas) {  // Constructor Kelas
                this.namaKelas = namaKelas;
            }

            void info() {
                System.out.println("Sekolah: " + namaSekolah);
                System.out.println("Kelas: " + namaKelas);
            }
        }
    }

    public static void main(String[] args) {
        Sekolah sekolah = new Sekolah("SMA Negeri 1");  // untuk object outer class (Sekolah)
        Sekolah.Kelas kelas = sekolah.new Kelas("X-A"); // untuk object inner class (Kelas)
        kelas.info(); 
    }
}