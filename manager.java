package praktikum;

public class manager extends employee {

    public manager(String nama, String istri, int id, int masuk, int jabatan, int anak) {
        super(nama, istri, id, masuk, jabatan, anak);
    }

    private double tunjanganJabatan;

    public double tunjanganJabatan() {
        return tunjanganJabatan = 0.1 * (gaji + bonus() + tunjanganAnak() + tunjanganIstri());
    }

    @Override
    public double total() {
        return bonus() + tunjanganIstri() + tunjanganAnak() + tunjanganJabatan();
    }

    public void display() {
        System.out.println("\n\tGaji Anda : Rp. " + total()+"0\n");
    }
}
