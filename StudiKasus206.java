import java.util.Scanner;

public class StudiKasus206 {
    public static void main(String[] args) {
        // Deklarasi variabel
        String nama, jenis;
        int jumlahDokumen, juara, statusPKM;

        Scanner sc = new Scanner(System.in);

        // Input data umum
        System.out.print("Nama mahasiswa  : ");
        nama = sc.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenis = sc.nextLine().trim().toLowerCase(); // huruf besar/kecil tidak berpengaruh

        if (jenis.equals("belmawa") || jenis.equals("bakorma") || jenis.equals("mandiri")) {
            // ===== Cabang perlombaan =====
            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Peringkat juara : ");
            juara = sc.nextInt();

            if (jumlahDokumen < 4) {
                System.out.println("Status : Dokumen tidak lengkap (kurang "
                        + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                if (juara >= 1 && juara <= 3) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan (Juara " + juara + ").");
                } else {
                    System.out.println("Status : Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
                }
            }

        } else if (jenis.equals("pkm")) {
            // ===== Cabang PKM =====
            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = sc.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            statusPKM = sc.nextInt();

            if (jumlahDokumen < 4) {
                System.out.println("Status : Dokumen tidak lengkap (kurang "
                        + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
            } else {
                if (statusPKM == 1) {
                    System.out.println("Status : Berhak memperoleh dana penghargaan (PKM lolos pendanaan).");
                } else {
                    System.out.println("Status : Tidak memperoleh dana penghargaan (PKM tidak lolos pendanaan).");
                }
            }

        } else {
            // ===== Lainnya =====
            System.out.println("Status : Tidak memperoleh dana penghargaan (jenis kegiatan tidak termasuk ketentuan).");
        }

    }
}