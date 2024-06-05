package week8a;

public class MobilSport extends Mobil
{
    public String jenisMesin;
    public String jenisMobil;

    public MobilSport(String lokasiStir, int jumlahPintu, String bahanBakar, String jenisMesin, String jenisMobil)
    {
        super(jumlahPintu, lokasiStir, jenisMobil, jumlahPintu, bahanBakar, jumlahPintu, jenisMobil);
        this.jenisMesin=jenisMesin;
        this.jenisMobil=jenisMobil;
    }

    public void getModeSport()
    {
        System.out.println("ModeSport pada " + jenisMobil + " telah diaktifkan");
    }

    public void getNitro()
    {
        System.out.println("Nitro dinyalakan");
    }
}
