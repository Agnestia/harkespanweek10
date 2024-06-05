package week9;
import java.util.Scanner;

public class BuatBangunDatar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            tampilkanMenu();
            System.out.print("Pilih menu : ");
            int pilihan = input.nextInt();

            if (pilihan == 17) {
                System.out.println("Keluar dari program.");
                input.close();
                break;
            }

            prosesPilihan(pilihan, input);
        }
    }

    public static void tampilkanMenu() {
        System.out.println("=== Menu Bangun Datar ===");
        System.out.println("1. Luas Persegi");
        System.out.println("2. Keliling Persegi");
        System.out.println("3. Luas Segitiga");
        System.out.println("4. Keliling Segitiga");
        System.out.println("5. Luas Persegi Panjang");
        System.out.println("6. Keliling Persegi Panjang");
        System.out.println("7. Luas Lingkaran");
        System.out.println("8. Keliling Lingkaran");
        System.out.println("9. Volume Kubus");
        System.out.println("10. Volume Tabung");
        System.out.println("11. Luas Jajar Genjang");
        System.out.println("12. Keliling Jajar Genjang");
        System.out.println("13. Luas Belah Ketupat");
        System.out.println("14. Keliling Belah Ketupat");
        System.out.println("15. Luas Segi Lima");
        System.out.println("16. Keliling Segi Lima");
        System.out.println("17. Keluar");
        System.out.println("");
    }

    public static void prosesPilihan(int pilihan, Scanner input) {
        switch (pilihan) {
            case 1:
                System.out.print("Masukkan sisi persegi: ");
                double sisi = input.nextDouble();
                BangunDatar persegi = new BangunDatar(sisi);
                System.out.println("Luas Persegi: " + persegi.hitungLuas(sisi) + " cm²");
                System.out.println("");
                break;

            case 2:
                System.out.print("Masukkan sisi: ");
                double sisiPersegi = input.nextDouble();
                BangunDatar kelilingPersegi = new BangunDatar(sisiPersegi);
                System.out.println("Keliling Persegi: " + kelilingPersegi.hitungKeliling(sisiPersegi) + " cm");
                System.out.println("");
                break;

            case 3:
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();
                System.out.println("Luas Segitiga: " + (0.5 * alas * tinggi) + " cm²");
                System.out.println("");
                break;

            case 4:
                System.out.print("Masukkan sisi kiri: ");
                double sisi1 = input.nextDouble();
                System.out.print("Masukkan sisi bawah: ");
                double sisi2 = input.nextDouble();
                System.out.print("Masukkan sisi kanan: ");
                double sisi3 = input.nextDouble();
                System.out.println("Keliling Segitiga: " + (sisi1 + sisi2 + sisi3) + " cm");
                System.out.println("");
                break;

            case 5:
                System.out.print("Masukkan panjang: ");
                double panjang = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebar = input.nextDouble();
                BangunDatar persegiPanjang = new BangunDatar(panjang, lebar);
                System.out.println("Luas Persegi Panjang: " + persegiPanjang.hitungLuas(panjang, lebar) + " cm²");
                System.out.println("");
                break;

            case 6:
                System.out.print("Masukkan panjang: ");
                double panjangPersegiPanjang = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lebarPersegiPanjang = input.nextDouble();
                BangunDatar kelilingPersegiPanjang = new BangunDatar(panjangPersegiPanjang, lebarPersegiPanjang);
                System.out.println("Keliling Persegi Panjang: " + kelilingPersegiPanjang.hitungKeliling(panjangPersegiPanjang, lebarPersegiPanjang) + " cm");
                System.out.println("");
                break;

            case 7:
                System.out.print("Masukkan jari-jari: ");
                double jariJari = input.nextDouble();
                System.out.println("Luas Lingkaran: " + (BangunDatar.getPi() * jariJari * jariJari) + " cm²");
                System.out.println("");
                break;

            case 8:
                System.out.print("Masukkan jari-jari: ");
                double jariJariKeliling = input.nextDouble();
                System.out.println("Keliling Lingkaran: " + (2 * BangunDatar.getPi() * jariJariKeliling) + " cm");
                System.out.println("");
                break;

            case 9:
                System.out.print("Masukkan sisi: ");
                double sisiKubus = input.nextDouble();
                BangunRuang kubus = new BangunRuang(sisiKubus);
                System.out.println("Volume Kubus: " + kubus.hitungVolumeKubus(sisiKubus) + " cm³");
                System.out.println("");
                break;

            case 10:
                System.out.print("Masukkan jari-jari: ");
                double jariJariTabung = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggiTabung = input.nextDouble();
                BangunRuang tabung = new BangunRuang(jariJariTabung, tinggiTabung);
                System.out.println("Volume Tabung: " + tabung.hitungVolumeTabung(jariJariTabung, tinggiTabung) + " cm³");
                System.out.println("");
                break;

            case 11:
                System.out.print("Masukkan alas: ");
                double alasJajarGenjang = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggiJajarGenjang = input.nextDouble();
                BangunDatar jajarGenjang = new BangunDatar(alasJajarGenjang, tinggiJajarGenjang, true);
                System.out.println("Luas Jajar Genjang: " + jajarGenjang.hitungLuasJajarGenjang(alasJajarGenjang, tinggiJajarGenjang) + " cm²");
                System.out.println("");
                break;

            case 12:
                System.out.print("Masukkan sisi1: ");
                double sisi1JajarGenjang = input.nextDouble();
                System.out.print("Masukkan sisi2: ");
                double sisi2JajarGenjang = input.nextDouble();
                BangunDatar kelilingJajarGenjang = new BangunDatar(sisi1JajarGenjang, sisi2JajarGenjang, true);
                System.out.println("Keliling Jajar Genjang: " + kelilingJajarGenjang.hitungKelilingJajarGenjang(sisi1JajarGenjang, sisi2JajarGenjang) + " cm");
                System.out.println("");
                break;

            case 13:
                System.out.print("Masukkan diagonal1: ");
                double diagonal1 = input.nextDouble();
                System.out.print("Masukkan diagonal2: ");
                double diagonal2 = input.nextDouble();
                BangunDatar belahKetupat = new BangunDatar(diagonal1, diagonal2, true, true);
                System.out.println("Luas Belah Ketupat: " + belahKetupat.hitungLuasBelahKetupat(diagonal1, diagonal2) + " cm²");
                System.out.println("");
                break;

            case 14:
                System.out.print("Masukkan sisi: ");
                double sisiBelahKetupat = input.nextDouble();
                BangunDatar kelilingBelahKetupat = new BangunDatar(sisiBelahKetupat);
                System.out.println("Keliling Belah Ketupat: " + kelilingBelahKetupat.hitungKelilingBelahKetupat(sisiBelahKetupat) + " cm");
                System.out.println("");
                break;

            case 15:
                System.out.print("Masukkan sisi: ");
                double sisiSegiLima = input.nextDouble();
                System.out.print("Masukkan apotema: ");
                double apotemaSegiLima = input.nextDouble();
                BangunDatar segiLima = new BangunDatar(sisiSegiLima, apotemaSegiLima, true, true, true);
                System.out.println("Luas Segi Lima: " + segiLima.hitungLuasSegiLima(sisiSegiLima, apotemaSegiLima) + " cm²");
                System.out.println("");
                break;

            case 16:
                System.out.print("Masukkan sisi: ");
                double sisiSegiLimaKeliling = input.nextDouble();
                BangunDatar kelilingSegiLima = new BangunDatar(sisiSegiLimaKeliling);
                System.out.println("Keliling Segi Lima: " + kelilingSegiLima.hitungKelilingSegiLima(sisiSegiLimaKeliling) + " cm");
                System.out.println("");
                break;

            case 17:
                System.out.println("Keluar dari program.");
                input.close();
                break;

            default:
                System.out.println("Pilihan tidak valid, coba ulang lagi.");
        }
    }
}
