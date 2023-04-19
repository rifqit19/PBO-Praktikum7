package latihan1;

public class Mobil2 {

    int gigi = 0;

    public void hidupkanMobil() {
        System.out.println("Mobil hidup....");
    }

    public void matikanMobil() {
        System.out.println("Mobil mati....");
    }

    void ubahGigi(int newValue) {
        gigi = gigi + newValue;
        System.out.println("gigi: " + gigi);
    }

}
