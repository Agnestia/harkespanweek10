package week4;
import week1.Mahasiswa;
import java.util.*;

public class Akademik
{
    public static void main(String[] args)
    {
        int n;
        System.out.print("Masukan jumlah data : ");

        //buat objek dari class scanner untuk menginput data
        Scanner inp = new Scanner(System.in);
        n = inp.nextInt();

        //buat variabel array dengan tipe Mahasiswa
        Mahasiswa[] mhs = new Mahasiswa[n];
        
        String nim, nama, skill;
        Float ipk;
        int usia;

        for(int i = 0; i < n; i++)
        {
            System.out.println("Data ke-"+(i+1));
            System.out.println("Masukan NIM: ");
            nim = inp.next();
            System.out.println("Masukan Nama: ");
            nama = inp.next();
            System.out.println("Masukan IPK: ");
            ipk = inp.nextFloat();
            System.out.println("Masukan Usia: ");
            usia = inp.nextInt();
            System.out.println("Masukan Skill: ");
            skill = inp.next();

            mhs[i] = new Mahasiswa(nim,nama,ipk,usia,skill);
        }

        for(int i = 0; i < n; i++)
        {
            System.out.println("Data ke-"+(i+1));
            mhs[i].getIdentitas();


        }


    }
}