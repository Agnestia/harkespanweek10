package week10;

public class PersegiPanjang extends BangunDatar{
    private int panjang;
    private int lebar;

    public PersegiPanjang(int panjang, int lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public int getPanjang(){
        return panjang;
    }
    public int getLebar(){
        return lebar;
    }
    public void Luas()
    {
        System.out.println("Luas persegi panjang dengan panjang " + panjang + " dan lebar " + lebar + " adalah "
        + hitungLuas());
    }

    public void Keliling(){
        System.out.println("Keliling persegi panjang dengan panjang " + panjang + " dan lebar " + lebar + " adalah " 
        + hitungKeliling());
    }

    public void hitungKeliling()
    {
        return 2 * panjang + 2 * lebar;
    }
    public int hitungLuas()
    {
        return panjang * lebar;
    }
}