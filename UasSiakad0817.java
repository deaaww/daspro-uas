import java.util.Scanner;

public class UasSiakad0817 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----------------------------");
        System.out.println("            SIAKAD          ");
        System.out.println("----------------------------");

        // Minta jumlah mahasiswa dan mata kuliah
        System.out.print("\nMasukkan Jumlah Mahasiswa: ");
        int jumlahMhs_dea = sc.nextInt();
        
        System.out.print("Masukkan Jumlah Mata Kuliah: ");
        int jumlahMataKuliah_dea = sc.nextInt();

        // Buat array 
        int[][] nilai_dea = new int[jumlahMhs_dea][jumlahMataKuliah_dea];
        String[] namaMhs_dea = new String[jumlahMhs_dea]; // Array untuk menyimpan nama mahasiswa

        // Input nama dan nilai untuk setiap siswa
        for (int i = 0; i < jumlahMhs_dea; i++) {
            System.out.print("\nMasukkan Nama Mahasiswa ke-" + (i + 1) + ": ");
            namaMhs_dea[i] = sc.next(); // Input nama mahasiswa

            System.out.println("Masukkan Nilai Mahasiswa ke-" + (i + 1));
            double totalPerMhs_dea = 0;
            for (int j = 0; j < jumlahMataKuliah_dea; j++) {
                System.out.print("Nilai Mata Kuliah ke-" + (j + 1) + " : ");
                nilai_dea[i][j] = sc.nextInt();
                totalPerMhs_dea += nilai_dea[i][j]; 
            }
            double rataRata = totalPerMhs_dea / jumlahMataKuliah_dea;
            System.out.println("\nRata-rata Nilai " + namaMhs_dea[i] + " : " + rataRata);

            // Menentukan kelulusan
            if (rataRata >= 75) {
                System.out.println(namaMhs_dea[i] + " dinyatakan LULUS.");
            } else {
                System.out.println(namaMhs_dea[i] + " dinyatakan TIDAK LULUS.");
            }
            System.out.println("\n====================================");
        }
        
        // Pencarian mahasiswa
        System.out.print("\nMasukkan Nama Mahasiswa yang Ingin Dicari: ");
        String namaDicari_dea = sc.next();
        boolean ditemukan_dea = false;

        for (int i = 0; i < jumlahMhs_dea; i++) {
            if (namaMhs_dea[i].equalsIgnoreCase(namaDicari_dea)) {
                ditemukan_dea = true;
                System.out.println("\nData Mahasiswa " + namaMhs_dea[i] + ":");
                double totalNilai_dea = 0;
                for (int j = 0; j < jumlahMataKuliah_dea; j++) {
                    System.out.println("Nilai Mata Kuliah ke-" + (j + 1) + ": " + nilai_dea[i][j]);
                    totalNilai_dea += nilai_dea[i][j];
                }
                double rataRata_dea = totalNilai_dea / jumlahMataKuliah_dea;
                System.out.println("Rata-rata Nilai: " + rataRata_dea);

                // Menentukan kelulusan
                if (rataRata_dea >= 75) {
                    System.out.println(namaMhs_dea[i] + " dinyatakan LULUS.");
                } else {
                    System.out.println(namaMhs_dea[i] + " dinyatakan TIDAK LULUS.");
                }
                break;
            }
        }

        if (!ditemukan_dea) {
            System.out.println("Mahasiswa dengan nama " + namaDicari_dea + " tidak ditemukan.");
        }

        sc.close();
    }    
}