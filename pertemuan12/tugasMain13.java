import java.util.Scanner;

public class tugasMain13 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tugasQueueLinkedList13 antrian = new tugasQueueLinkedList13();

        int pilih;
        do {
            System.out.println("\n=== MENU ANTRIAN LAYANAN KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Cek Antrian Kosong");
            System.out.println("4. Cek Antrian Penuh");
            System.out.println("5. Kosongkan Antrian");
            System.out.println("6. Tampilkan Semua Antrian");
            System.out.println("7. Tampilkan Depan dan Belakang");
            System.out.println("8. Jumlah Mahasiswa dalam Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); // buang newline

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama  : ");
                    String nama = sc.nextLine();
                    antrian.enqueue(new tugasMahasiswa13(nim, nama));
                    break;
                case 2:
                    antrian.dequeue();
                    break;
                case 3:
                    System.out.println(antrian.isEmpty() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 4:
                    System.out.println(antrian.isFull() ? "Antrian penuh." : "Antrian belum penuh.");
                    break;
                case 5:
                    antrian.clear();
                    break;
                case 6:
                    antrian.tampilkanAntrian();
                    break;
                case 7:
                    antrian.tampilkanDepanBelakang();
                    break;
                case 8:
                    antrian.jumlahAntrian();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilih != 0);

        sc.close();
    }
}
