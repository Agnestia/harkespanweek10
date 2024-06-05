package week1;
import week5.Matakuliah;
import java.util.ArrayList;
import java.util.Iterator;

public class Mahasiswa
{
    private String nim, nama, skill;
    private int usia;
    private Float ipk;
    private ArrayList<Double> nilai = new ArrayList<Double>();
    private ArrayList<Matakuliah> mk = new ArrayList<Matakuliah>();

    public Mahasiswa(String nama, String nim, Float ipk, int usia, String skill)
    {
        this.nim = nim;
        this.nama = nama;
        this.ipk = ipk;
        this.usia = usia;
        this.skill = skill;
    }

    public void insertNilai(Double nl)
    {
        nilai.add(nl);
    }

    public void insertMatkul(String matkul, String kelompok, int sks)
    {
        mk.add(new Matakuliah(matkul, kelompok, sks));
    }

    public void belajar()
    {
        System.out.println(nama + " belajar");
    }

    public void mainGame()
    {
        System.out.println(nama + " main game");
    }

    public void GetSkill()
    {
        System.out.println(skill + " good guy");
    }

    public void GetNilai()
    {
        Iterator<Double> it = nilai.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
    }

    public void getMatakuliah()
    {
        System.out.println("Daftar Mata Kuliah");
        for(Matakuliah matkul : mk)
        {
            System.out.println(matkul.getNamaMatkul() + " - " + matkul.getKelompok() + " - " + matkul.getSks());
        }
    }

    public void getIdentitas()
    {
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("NIM : " + nim);
        System.out.println("IPK: " + ipk);
        System.out.println("Usia : " + usia);
        System.out.println("Skill : " + skill);
        GetNilai();
        getMatakuliah();
    }
}