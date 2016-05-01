package praktikum;

public class employee {

    protected String nama, istri;
    protected int id, masuk, jabatan, anak;
    protected double bonus, tunjanganAnak, tunjanganIstri, tunjangan;
    protected static final int gaji = 2000000;

    public employee(String nama, String istri, int id, int masuk, int jabatan, int anak) {
        this.nama = nama;
        this.istri = istri;
        this.id = id;
        this.masuk = masuk;
        this.jabatan = jabatan;
        this.anak = anak;
    }

    public double bonus() {
        int tahun = 2016 - masuk;
        if (tahun >= 6 && tahun <= 10) {
            bonus = (0.05 * tahun * gaji) + gaji;
        } else if (tahun > 10) {
            bonus = (0.1 * tahun * gaji) + gaji;
        } else {
            return gaji;
        }
        return bonus;
    }

    public double tunjanganIstri() {
        if (istri.equalsIgnoreCase("ada")) {
            tunjanganIstri = 0.1 * bonus;
        } 
        else{
            return 0;
        }
        return tunjanganIstri;
    }

    public double tunjanganAnak() {
        if (anak <= 3) {
            tunjanganAnak = anak * 0.15 * bonus;
        } else {
            tunjanganAnak = 3 * 0.15 * bonus;
        }
        return tunjanganAnak;
    }

    public double total() {
        return bonus() + tunjanganIstri() + tunjanganAnak();
    }

}
