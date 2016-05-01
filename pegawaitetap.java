package praktikum;

public class pegawaitetap extends employee {

    public pegawaitetap(String nama, String istri, int id, int masuk, int jabatan, int anak) {
        super(nama, istri, id, masuk, jabatan, anak);
    }

    @Override
    public double total() {
        return bonus() + tunjanganIstri() + tunjanganAnak();
    }

    public void display() {
        System.out.println("\n\tGaji Anda : Rp. " + total()+"\n");
    }
}
