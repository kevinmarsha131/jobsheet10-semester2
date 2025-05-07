import java.util.Scanner;

public class tugasmain13 {
    public static void main(String[] args) {
        tugasantriankrs13 antrian = new tugasantriankrs13(10);
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\n--- MENU ANTRIAN KRS ---");
            System.out.println("1.  Tambah Mahasiswa ke Antrian");
            System.out.println("2.  Proses 2 Mahasiswa");
            System.out.println("3.  Tampilkan Semua Antrian");
            System.out.println("4.  Tampilkan 2 Terdepan");
            System.out.println("5.  Tampilkan Antrian Terakhir");
            System.out.println("6.  Cek Antrian Kosong");
            System.out.println("7.  Cek Antrian Penuh");
            System.out.println("8.  Kosongkan Antrian");
            System.out.println("9.  Jumlah Antrian");
            System.out.println("10. Jumlah yang Sudah Proses KRS");
            System.out.println("11. Mahasiswa Belum Proses (DPA 10 x 30)");
            System.out.println("0.  Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = sc.nextLine();
                    tugasmahasiswa13 m = new tugasmahasiswa13(nim, nama, prodi);
                    antrian.enqueue(m);
                    break;
                case 2:
                    antrian.prosesKRS();
                    break;
                case 3:
                    antrian.tampilkanSemua();
                    break;
                case 4:
                    antrian.tampilkan2Terdepan();
                    break;
                case 5:
                    antrian.tampilkanAkhir();
                    break;
                case 6:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong" : "Antrian tidak kosong");
                    break;
                case 7:
                    System.out.println(antrian.isFull() ? "Antrian penuh" : "Antrian tidak penuh");
                    break;
                case 8:
                    antrian.clear();
                    break;
                case 9:
                    antrian.cetakJumlahAntrian();
                    break;
                case 10:
                    antrian.cetakJumlahSudahProses();
                    break;
                case 11:
                    antrian.cetakBelumProses();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);
        sc.close();
    }
}
