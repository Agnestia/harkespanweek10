package week9;

public class BangunRuang extends BangunDatar {
    private Double tinggi;

    public BangunRuang(Double sisi) {
        super(sisi);
    }

    public BangunRuang(Double jariJari, Double tinggi) {
        super(jariJari);
        this.tinggi = tinggi;
    }

    public double hitungVolumeKubus(Double sisi) {
        return sisi * sisi * sisi;
    }

    public double hitungVolumeTabung(Double jariJari, Double tinggi) {
        return getPi() * jariJari * jariJari * tinggi;
    }
}
