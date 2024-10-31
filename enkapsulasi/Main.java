package enkapsulasi;

public class Main {
    public static void main(String[] args) {
        BankAccount karlaShanessa = new BankAccount(100);

        //beli minuman 10 (withdraw);
        karlaShanessa.withDraw(10);
        System.out.println("Current balance is: " + karlaShanessa.getBalance());
    }
}
