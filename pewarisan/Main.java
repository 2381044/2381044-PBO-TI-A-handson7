package pewarisan;

public class Main {
    public static void main(String[] args) {
        Mobil mobilku = new Mobil("Toyota", "Avanza", 2022, "4", );
        Motor motorku = new Motor("Honda", "CBR250RR", 2023);

        mobilku.infoMobil();
        motorku.infoMotor();
    }
}