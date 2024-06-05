package week8a;

public class Mobil extends Kendaraan 
{
    public String lokasiStir;
    public int jumlahPintu;
    public String bahanBakar;

    public Mobil(int roda, String warna, String merk, int tahun, String lokasiStir, int jumlahPintu, String bahanBakar)
    {
        super(roda, warna, merk,tahun);
        this.lokasiStir=lokasiStir;
        this.jumlahPintu=jumlahPintu;
        this.bahanBakar=bahanBakar;
        
    }
    
    public String getlokasiStir()
    {
        return lokasiStir;
    }

    public int getJumlahPintu()
    {
        return jumlahPintu;
    }

    public String getBahanBakar()
    {
        return bahanBakar;
    }

    public void getBukaPintu()
    {
        System.out.println("Membuka pintu mobil");
    }

    public void getTutupPintu()
    {
        System.out.println("Menutup pintu mobil");
    }

}
