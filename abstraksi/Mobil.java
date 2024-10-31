package abstraksi;

public class Mobil extends Kendaraan {

    public Mobil(final String warna) {
        super(warna);
        this.warna = warna;
    }

    @Override
    void bergerak() {
        System.out.println("Mobil bergerak di jalan");
    }

}
