package week9;

public class BangunDatar {
    private Double panjang, lebar, sisi, alas, tinggi, diagonal1, diagonal2, apotema;
    private static final Double PI = 3.14;

    public BangunDatar(Double sisi) {
        this.sisi = sisi;
    }

    public BangunDatar(Double panjang, Double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public BangunDatar(Double alas, Double tinggi, boolean isJajarGenjang) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public BangunDatar(Double diagonal1, Double diagonal2, boolean isBelahKetupat, boolean dummy) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public BangunDatar(Double sisi, Double apotema, boolean isSegiLima, boolean dummy1, boolean dummy2) {
        this.sisi = sisi;
        this.apotema = apotema;
    }

    // Overloaded methods for different shapes
    public Double hitungLuas(Double sisi) {
        return sisi * sisi;
    }

    public Double hitungLuas(Double panjang, Double lebar) {
        return panjang * lebar;
    }

    public Double hitungKeliling(Double sisi) {
        return 4 * sisi;
    }

    public Double hitungKeliling(Double panjang, Double lebar) {
        return 2 * (panjang + lebar);
    }

    public Double hitungLuasJajarGenjang(Double alas, Double tinggi) {
        return alas * tinggi;
    }

    public Double hitungKelilingJajarGenjang(Double sisi1, Double sisi2) {
        return 2 * (sisi1 + sisi2);
    }

    public Double hitungLuasBelahKetupat(Double diagonal1, Double diagonal2) {
        return 0.5 * diagonal1 * diagonal2;
    }

    public Double hitungKelilingBelahKetupat(Double sisi) {
        return 4 * sisi;
    }

    public Double hitungLuasSegiLima(Double sisi, Double apotema) {
        return (5 * sisi * apotema) / 2;
    }

    public Double hitungKelilingSegiLima(Double sisi) {
        return 5 * sisi;
    }

    public static Double getPi() {
        return PI;
    }
}
