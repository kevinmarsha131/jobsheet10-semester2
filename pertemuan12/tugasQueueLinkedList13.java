public class tugasQueueLinkedList13 {
    tugasNode13 front, rear;
    int size;
    final int MAX_SIZE = 10;

    public tugasQueueLinkedList13() {
        front = rear = null;
        size = 0;
    }

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return size >= MAX_SIZE;
    }

    void enqueue(tugasMahasiswa13 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh! Tidak bisa menambahkan.");
            return;
        }
        tugasNode13 newNode = new tugasNode13(mhs);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println("Mahasiswa berhasil ditambahkan ke antrian.");
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong! Tidak ada yang bisa dipanggil.");
            return;
        }
        System.out.println("Mahasiswa yang dipanggil:");
        front.data.tampil();
        front = front.next;
        size--;
        if (isEmpty()) {
            rear = null;
        }
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian telah dikosongkan.");
    }

    void tampilkanAntrian() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return;
        }
        System.out.println("Isi Antrian:");
        tugasNode13 temp = front;
        while (temp != null) {
            temp.data.tampil();
            System.out.println("----------------");
            temp = temp.next;
        }
    }

    void tampilkanDepanBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println("Antrian Terdepan:");
            front.data.tampil();
            System.out.println("Antrian Paling Akhir:");
            rear.data.tampil();
        }
    }

    void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa dalam antrian: " + size);
    }
}
