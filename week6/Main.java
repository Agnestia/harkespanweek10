package week6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = scanner.nextInt();
        scanner.nextLine(); // Membuang newline

        Mahasiswa[] mahasiswa = new Mahasiswa[jumlahMahasiswa];

        // Input data mahasiswa
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nama Mahasiswa ke-" + (i + 1) + ":");
            String nama = scanner.nextLine();
            System.out.println("Masukkan Semester Mahasiswa ke-" + (i + 1) + ":");
            int semester = scanner.nextInt();
            System.out.println("Masukkan jumlah sks Mahasiswa ke-" + (i + 1) + ":");
            int sks = scanner.nextInt();
            scanner.nextLine(); // Membuang newline

            mahasiswa[i] = new Mahasiswa(nama, semester, sks);
        }

        // Menampilkan data mahasiswa dan tagihan
        for (Mahasiswa mhs : mahasiswa) {
            System.out.println("Nama: " + mhs.getNama());
            System.out.println("Semester: " + mhs.getSemester());
            System.out.println("SKS: " + mhs.getSks());
            int tagihan = mhs.hitungTagihan();
            System.out.println("Tagihan (SPP + biaya SKS): " + tagihan);
            System.out.println();
        }

        scanner.close();
    }
}