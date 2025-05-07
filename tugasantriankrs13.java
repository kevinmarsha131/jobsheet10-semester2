public class tugasantriankrs13 {
    tugasmahasiswa13[] queue;
    int front, rear, size, max;
    int totalProses = 0;

    public tugasantriankrs13(int max) {
        this.max = max;
        queue = new tugasmahasiswa13[max];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(tugasmahasiswa13 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        if (isEmpty()) front = 0;
        rear = (rear + 1) % max;
        queue[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Minimal 2 mahasiswa untuk proses KRS!");
            return;
        }
        System.out.println("Memproses KRS untuk:");
        for (int i = 0; i < 2; i++) {
            System.out.println("- " + queue[front]);
            queue[front] = null;
            front = (front + 1) % max;
            size--;
            totalProses++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Isi Antrian:");
        int i = front;
        for (int count = 0; count < size; count++) {
            System.out.println(queue[i]);
            i = (i + 1) % max;
        }
    }

    public void tampilkan2Terdepan() {
        if (size < 2) {
            System.out.println("Belum ada 2 antrian.");
            return;
        }
        System.out.println("2 Antrian Terdepan:");
        int i = front;
        for (int j = 0; j < 2; j++) {
            System.out.println(queue[i]);
            i = (i + 1) % max;
        }
    }

    public void tampilkanAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Antrian terakhir: " + queue[rear]);
        }
    }

    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public void cetakJumlahAntrian() {
        System.out.println("Jumlah dalam antrian: " + size);
    }

    public void cetakJumlahSudahProses() {
        System.out.println("Jumlah sudah proses KRS: " + totalProses * 2);
    }

    public void cetakBelumProses() {
        int belum = (10 * 30) - (totalProses * 2);
        System.out.println("Mahasiswa belum proses KRS (dari 10x30): " + belum);
    }
}