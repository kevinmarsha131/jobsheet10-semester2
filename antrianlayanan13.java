public class antrianlayanan13 {
    Mahasiswa13 [] data;
    int front;
    int rear;
    int size;
    int max;

    public antrianlayanan13(int max){
        this.max = max;
        this.data = new Mahasiswa13[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;  
    }
    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isFull(){
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }
    public void lihatterdepan() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkandata();
        }
    }
    public void tampilkansemua () {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } 
        System.out.println("Daftar Mahasiswa dalam Antrian: ");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkandata();
        }
    }
    public void clear () {
      if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }
    public void tambahantrian (Mahasiswa13 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh tidak dapat menambah mahasiswa");
            return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " berhasil masuk ke antrian");
    }
    public Mahasiswa13 layaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return null;
        } 
        Mahasiswa13 mhs = data[front];
        front = (front + 1) % max;
        size --;
        return mhs;
    }
    public int getjumlahantrian() {
        return size;
    }
    public void lihatakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa terakhir: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[rear].tampilkandata();
        }
    }
}

