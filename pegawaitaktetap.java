package praktikum;

public class pegawaitaktetap extends employee {

    public pegawaitaktetap(String nama, String istri, int id, int masuk, int jabatan, int anak,int jamLembur) {
        super(nama, istri, id, masuk, jabatan, anak);
        this.jamLembur=jamLembur;
    }
    
    private int jamLembur;
    private double gajiLembur;

    public double gajiLembur() {
        if (jamLembur > 10) {
            gajiLembur = 10000*(jamLembur-10);
        }
        else{
            gajiLembur=0;
        }
        return gajiLembur;
    }

    @Override
    public double total() {
        return gaji+gajiLembur();
    }

    public void display() {
        System.out.println("\n\tGaji Anda : Rp. " + total()+"0\n");
    }

}
