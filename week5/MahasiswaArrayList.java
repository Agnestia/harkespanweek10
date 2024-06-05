package week5;
import week1.Mahasiswa;
import java.util.*;

public class MahasiswaArrayList
{
    public static void main(String[] args)
    {
        Mahasiswa mhs = new Mahasiswa("Budi","12345", 3.99f, 20, "Investor");
        mhs.insertNilai(86.0);
        mhs.insertNilai(88.0);
        mhs.insertNilai(89.0);
        mhs.insertNilai(90.0);
        mhs.insertMatkul("PBO","444",4);
        mhs.getIdentitas();
        
    }
}