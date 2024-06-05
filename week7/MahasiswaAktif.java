package week7;
import week1.Mahasiswa;

public class MahasiswaAktif extends Mahasiswa
{
    public int usia;
    public int semester;

    public MahasiswaAktif(String nim, String nama, String tanggal_lahir, int semester)
    {
        super(nama, nim, tgl_lahir);
        this.semester = semester;

    }

    public int getUsia()
    {
        return usia;
    }

    public int getSemester()
    {
        return semester;
    }
    public void getIdentitas()
        {
            System.out.println("Nama mahasiswa: " + super.getNama());
            System.out.println("NIM: " + super.getNim());
            System.out.println("Tanggal Lahir:  " + super.getTanggalLahir());
            System.out.println("usia: " + getUsia());
            System.out.println("Semester: " + getSemester());
        }
}