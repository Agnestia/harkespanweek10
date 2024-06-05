package week8a;

public class Kendaraan
{
    public int roda;
    public String warna, merk;
    public int tahun;

    public Kendaraan(int roda, String warna, String merk, int tahun)
    {
        this.roda=roda;
        this.warna=warna;
        this.merk=merk;
        this.tahun=tahun;
    }

    public int getRoda()
    {
        return roda;
    }

    public String getWarna()
    {
        return warna;
    }

    public String getMerk()
    {
        return merk;
    }

    public int getTahun()
    {
        return tahun;
    }

    public void getRoda(String roda)
    {
        System.out.println("Jumlah roda : " + roda);
    }

    public void getMaju()
    {
        System.out.println("Berjalan maju");
    }

    public void getMundur()
    {
        System.out.println("Bergerak mundur");
    }

    public void getRem()
    {
        System.out.println("Berjalan maju");
    }

    public void getMerk(String merk)
    {
        System.out.println("Merk kendaraan adalah " + merk);
    }
}
