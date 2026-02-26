/*
Nama    : Larra Syifa As Shaum
NIM     : D1041241070
Tanggal : 26 Februari 2026
*/

package pertemuan5;

public class LatihanLogin {

    public static void main(String[] args) {

        String inputUsername = "admin";     
        String inputPassword = "admin123";  

        System.out.println("=== VALIDASI LOGIN ===");
        System.out.println("Username: " + inputUsername);
        System.out.println("Password: ****");
        System.out.println("---");

        // cek username 
        if (inputUsername.equals("admin")) {

            System.out.println("Username valid");

            // cek password
            if (inputPassword.equals("admin123")) { // bisa ganti jadi "admin321" buat testing output gagal
                System.out.println("Password benar");
                System.out.println("LOGIN BERHASIL!");
                System.out.println("Selamat datang, " + inputUsername);
            } else {
                System.out.println("Password salah"); 
                System.out.println("LOGIN GAGAL!");
            }

        } else {
            System.out.println("Username tidak ditemukan"); 
            System.out.println("LOGIN GAGAL!");
        }
    }
}