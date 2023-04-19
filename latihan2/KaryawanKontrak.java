package latihan2;

// upahharian, mtd tital upah(upah harian x haru masuk + tunjangan anak)
public class KaryawanKontrak extends Karyawan {

    float upahharian = 40000;
    float totalUpah = 0;

    public void getTotalUpah(int hariKerja) {
        totalUpah = (upahharian * hariKerja) + getTunjanganAnak(upahharian * hariKerja);
        System.out.println("Total gaji karyawan tetap adalah: RP." + String.format("%.0f", totalUpah));
    }

}
