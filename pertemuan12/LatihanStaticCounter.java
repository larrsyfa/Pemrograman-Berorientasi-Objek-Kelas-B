/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 25 Maret 2026
*/

package pertemuan12;

public class LatihanStaticCounter {
    static int jumlahMahasiswa = 0;
    String nama;
 
    // Constructor
    LatihanStaticCounter(String nama) {
        this.nama = nama;
        jumlahMahasiswa++;
        System.out.println("Mahasiswa dibuat: " + nama);
    }
 
    // Method untuk mengambil jumlah mahasiswa
    static int getJumlah() {
        return jumlahMahasiswa;
    }

    public static void main(String[] args) {

        // object mahasiswa
        LatihanStaticCounter m1 = new LatihanStaticCounter("Andi");
        LatihanStaticCounter m2 = new LatihanStaticCounter("Budi");
        LatihanStaticCounter m3 = new LatihanStaticCounter("Citra");
        System.out.println("Total Mahasiswa: " + LatihanStaticCounter.getJumlah());
    }
}