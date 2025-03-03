import java.util.Scanner; //Scanner ini digunakan untuk membaca input angka dan teks.

public class LoginSystem { //program ini adalah sebuah class dengan nama LoginSystem.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
// menu pilihan login
        System.out.println("Pilih Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (choice == 1) {
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            // Validasi login Admin
            String lastThreeDigitsNIM = "118";
            String validUsername = "Rosyad" + lastThreeDigitsNIM;
            String validPassword = "Rosyad" + lastThreeDigitsNIM;

            if (username.equals(validUsername) && password.equals(validPassword)) {
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (choice == 2) {
            System.out.print("Masukkan Nama: ");
            String name = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            // Validasi login Mahasiswa
            String validName = "muhammad rosyad";
            String validNIM = "202410370110118";

            if (name.equals(validName) && nim.equals(validNIM)) {
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + name);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close(); //menutup scanner
    }
}