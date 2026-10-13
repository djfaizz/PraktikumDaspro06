import java.util.Scanner;

public class StudiKasus106 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hargaPerCup = 18000;
        int jumlahCup, uangBayar;
        int totalHarga, diskon, totalBayar;
        int kembalian, kurang;

        System.out.print("Masukkan jumlah cup yang dibeli: ");
        jumlahCup = scanner.nextInt();
        System.out.print("Masukkan uang yang dibayar: ");
        uangBayar = scanner.nextInt();

        totalHarga = hargaPerCup * jumlahCup;


    }
}
