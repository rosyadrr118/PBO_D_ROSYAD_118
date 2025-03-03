import java.util.Scanner; //untuk membaca input pengguna
import java.time.LocalDate; //digunakan untuk mendapatkan tanggal saaat ini

public class Main {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // bagian ini Meminta pengguna memasukkan nama
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        // bagian ini Meminta pengguna memasukkan jenis kelamin (P/L)
        System.out.print("Masukkan jenis kelamin (P/L): ");
        char jenisKelamin = scanner.next().charAt(0);

        // pada bagian ini Meminta pengguna memasukkan tahun lahir
        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        // Menutup Scanner setelah selesai membaca input
        scanner.close();

        // Menghitung umur berdasarkan tahun lahir
        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        // Menentukan jenis kelamin dalam bentuk teks
        String jenisKelaminTeks;
        if (jenisKelamin == 'L' || jenisKelamin == 'l') {
            jenisKelaminTeks = "Laki-laki";
        } else if (jenisKelamin == 'P' || jenisKelamin == 'p') {
            jenisKelaminTeks = "Perempuan";
        } else {
            jenisKelaminTeks = "Tidak diketahui";
        }

        // untukMenampilkan output sesuai format yang diminta
        System.out.println("\nData Diri:");
        System.out.println("Nama            : " + nama);
        System.out.println("Jenis Kelamin   : " + jenisKelaminTeks);
        System.out.println("Umur            : " + umur + " tahun");
    }
}