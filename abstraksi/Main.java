package abstraksi;

public class Main {
    public static void main(String[] args) {
        Perahu perahuMerah = new Perahu("merah");
        Mobil mobilMerah = new Mobil("Merah");

        perahuMerah.bergerak();
        mobilMerah.bergerak();
    }
}
