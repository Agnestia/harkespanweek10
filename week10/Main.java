package week10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan panjang     : ");
    int panjang = input.nextInt();
    System.out.print("Masukkan lebar       : ");
    int lebar = input.nextInt();

    PersegiPanjang pp = new PersegiPanjang(panjang, lebar);
    PersegiPanjang pk = new PersegiPanjang(panjang, lebar);
    pp.Luas();
    pk.Keliling();

    input.close();
}
}