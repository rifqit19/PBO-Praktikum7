package latihan2;

// gajipokok, mtd hitung total gaji(gajipokok + tnujangan anak)
public class KaryawanTetap extends Karyawan {

    float gajiPokok = 5000000;
    float totalGaji = 0;

    public void getTotalGaji() {
        totalGaji = gajiPokok + getTunjanganAnak(gajiPokok);
        System.out.println("Total gaji karyawan tetap adalah: RP." + String.format("%.0f", totalGaji));
    }

}
