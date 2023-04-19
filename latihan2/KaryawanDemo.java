package latihan2;

public class KaryawanDemo {
    public static void main(String[] args) {

        System.out.println("\nDaftar gaji karyawan:");
        System.out.println("---------------------");

        KaryawanTetap kt = new KaryawanTetap();
        kt.getTotalGaji();

        KaryawanKontrak kk = new KaryawanKontrak();
        kk.getTotalUpah(20);
    }
}
