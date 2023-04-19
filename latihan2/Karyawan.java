package latihan2;

public class Karyawan {

    // tunjangan anak 2% dari gaji
    int tunjangAnak = 2;

    public float getTunjanganAnak(float gaji) {

        return (tunjangAnak * gaji) / 100;
    }
}
