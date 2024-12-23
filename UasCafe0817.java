import java.util.Scanner;

public class UasCafe0817 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("        CAFE NUSANTARA      ");
        System.out.println("----------------------------");

        // Input nama pelanggan
        System.out.print("Masukkan Nama Pelanggan: ");
        String namaPelanggan_dea = sc.nextLine();
        
        // Input jumlah pesanan
        System.out.print("Masukkan Jumlah Pesanan: ");
        int jumlahPesanan_dea = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan_dea = new String[jumlahPesanan_dea];
        double[] hargaPesanan_dea = new double[jumlahPesanan_dea];
        double total_dea = 0;

        // Input nama dan harga pesanan
        for (int i = 0; i < jumlahPesanan_dea; i++) {
            System.out.print("\nMasukkan Nama Pesanan ke-" + (i + 1) + ": ");
            namaPesanan_dea[i] = sc.nextLine();

            System.out.print("Masukkan Harga Pesanan ke-" + (i + 1) + ": Rp ");
            hargaPesanan_dea[i] = sc.nextDouble();
            sc.nextLine(); 

            // Tambahkan harga ke total
            total_dea += hargaPesanan_dea[i];
        }
        System.out.println("\n=============================");

        // Tanya apakah pengguna adalah member setelah semua pesanan dimasukkan
        System.out.print("\nApakah Anda Member? (ya / tidak): ");
        String isMember_dea = sc.next();

        // Jika member, berikan diskon 10% pada total
        if (isMember_dea.equalsIgnoreCase("ya")) {
            double diskon_dea = total_dea * 0.10; // Hitung diskon
            total_dea -= diskon_dea; // Kurangi total dengan diskon
            System.out.println("\nDiskon 10% diterapkan: Rp " + diskon_dea);
        }

        // Tampilkan total akhir
        System.out.println("\n=============================");
        System.out.println("Pelanggan Atas Nama " + namaPelanggan_dea);
        System.out.println("Total Jumlah Pesanan Anda: Rp " + total_dea);
        sc.close();
    }
}