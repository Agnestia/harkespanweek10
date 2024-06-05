package week6;


class Mahasiswa {
    private String nama;
    private int semester;
    private int sks;

    public Mahasiswa(String nama, int semester, int sks){
        this.nama = nama;
        this.semester = semester;
        this.sks = sks;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public void setSemester(int semester)
    {
        this.semester = semester;
    }

    public int getSemester(){
        return semester;
    }

    public void setSks(int sks){
        this.sks = sks;
    }

    public int getSks(){
        return sks;
    }

    public int hitungTagihan(){
        int biayaPerSks;
        int spp;
    
    if(semester<2){
        biayaPerSks = 300000;
        spp = 3000000;
    } 
    else if (semester >=3 && semester <=6){
        biayaPerSks = 275000;
        spp = 2900000;
    }
    else{
        biayaPerSks = 250000;
        spp = 2750000;
    }

    return (biayaPerSks * sks) + spp;
    }
}