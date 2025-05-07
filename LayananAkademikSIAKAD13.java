import java.util.Scanner;
public class LayananAkademikSIAKAD13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        antrianlayanan13 antrian = new antrianlayanan13(5);
        int pilihan;
        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Mahasiswa Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Jumlah Mahasiswa dalam Anrtian");
            System.out.println("6. Lihat Mahasiswa Terakhir");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt(); sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("NIM       : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama      : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi     : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas     : ");
                    String kelas = sc.nextLine();
                    Mahasiswa13 mhs = new Mahasiswa13(nim, nama, prodi, kelas);
                    antrian.tambahantrian(mhs);
                    break;
                case 2:
                    Mahasiswa13 dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("Melayani mahasiswa ");
                        dilayani.tampilkandata();
                    }
                    break;
                case 3:
                    antrian.lihatterdepan();
                    break;
                case 4:
                    antrian.tampilkansemua();
                case 5:
                    System.out.println("Jumlah dalam antrian: " + antrian.getjumlahantrian());
                case 6:
                    antrian.lihatakhir();
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);
        sc.close();
    }
}