/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 20 Februari 2026
*/

class Mobil {
    String merk;
    String warna;
    int tahun;
    int kecepatan;

    public void percepat() {
        kecepatan += 10;
    }

    public void tampilkanInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Warna: " + warna);
        System.out.println("Tahun: " + tahun);
    }
}

public class InfoMobil {
    public static void main(String[] args) {

        Mobil obj;
        obj = new Mobil();

        obj.merk = "Porsche";
        obj.warna = "Pink";
        obj.tahun = 2006;
        obj.kecepatan = 40;

        obj.percepat();
        obj.tampilkanInfo();
        System.out.println("Kecepatan: " + obj.kecepatan);
    }
}