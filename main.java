package praktikum;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String nama, tri;
        int id, masuk, jabatan, anak, lembur;

        System.out.println("=============================================");
        System.out.println("\tINFORMASI GAJI PEGAWAI CV.KOMDAS");
        System.out.println("=============================================\n");
        System.out.print("Nama\t\t: ");
        nama = in.next();
        System.out.print("ID\t\t: ");
        id = in.nextInt();
        System.out.println("Jabatan ");
        System.out.println("1.Manager\n2.Pegawai Tetap\n3.Pegawai Tidak Tetap");
        System.out.print("Masukkan jabatan Anda\t: ");
        jabatan = in.nextInt();
        if (jabatan == 1) {
            System.out.print("Tahun masuk\t\t: ");
            masuk = in.nextInt();
            System.out.print("Istri(ada/tidak)\t: ");
            tri = in.next();
            System.out.print("Anak\t\t\t: ");
            anak = in.nextInt();
            manager man = new manager(nama, tri, id, masuk, 1, anak);
            System.out.println("*********************************************");
            man.display();
            System.out.println("*********************************************");
        } else if (jabatan == 2) {
            System.out.print("Tahun masuk\t\t: ");
            masuk = in.nextInt();
            System.out.print("Istri(ada/tidak)\t: ");
            tri = in.next();
            System.out.print("Anak\t\t\t: ");
            anak = in.nextInt();
            pegawaitetap tetap = new pegawaitetap(nama, tri, id, masuk, 2, anak);
            System.out.println("*********************************************");
            tetap.display();
            System.out.println("*********************************************");
        } else {
            System.out.print("Tahun masuk\t\t: ");
            masuk = in.nextInt();
            System.out.print("Istri(ada/tidak)\t: ");
            tri = in.next();
            System.out.print("Anak\t\t\t: ");
            anak = in.nextInt();
            System.out.print("Jumlah jam lembur\t: ");
            lembur = in.nextInt();
            pegawaitaktetap tak = new pegawaitaktetap(nama, tri, id, masuk, 3, anak, lembur);
            System.out.println("*********************************************");
            tak.display();
            System.out.println("*********************************************");
        }
    }
}
