import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Hewan ===");
        System.out.print("Masukkan jenis hewan (anjing/kucing): ");
        String jenis = input.nextLine().toLowerCase();

        System.out.print("Masukkan nama hewan: ");
        String nama = input.nextLine();

        System.out.print("Masukkan umur hewan: ");
        int umur = input.nextInt();

        System.out.println("\n=== Hasil Data Hewan ===");

        if (jenis.equals("anjing")) {
            Anjing anjing = new Anjing();
            anjing.setNama(nama);
            anjing.setUmur(umur);

            System.out.println("Jenis Hewan: Anjing");
            System.out.println("Nama: " + anjing.getNama());
            System.out.println("Umur: " + anjing.getUmur());
            System.out.println("Makanan: " + anjing.getMakanan());

        } else if (jenis.equals("kucing")) {
            Kucing kucing = new Kucing();
            kucing.setNama(nama);
            kucing.setUmur(umur);

            System.out.println("Jenis Hewan: Kucing");
            System.out.println("Nama: " + kucing.getNama());
            System.out.println("Umur: " + kucing.getUmur());
            System.out.println("Makanan: " + kucing.getMakanan());

        } else {
            System.out.println("Jenis hewan tidak dikenali!");
        }

        input.close();
    }
}