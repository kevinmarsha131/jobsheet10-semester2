import java.util.Scanner;
public class QueueMain13 {
    public static void menu () {
        System.out.println("Masukkan operasi yang diinginkan: ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("------------------");
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Masukkan ukuran queue: ");
        int n = sc.nextInt();  
        Queue13 q = new Queue13(n);
        int pilih;
        do {
            menu (); 
            pilih = sc.nextInt(); 
            switch (pilih) { 
                case 1: 
                    System.out.print("Masukkan data baru: ");
                    int dataMasuk = sc.nextInt(); 
                    q.Enqueue(dataMasuk); 
                    break; 
                case 2: 
                    int dataKeluar = q.Dequeue(); 
                    System.out.println("Data yang dikeluarkan: " + dataKeluar); 
                    break;
                case 3: 
                    q.print(); 
                    break; 
                case 4: 
                    q.peek(); 
                    break; 
                case 5: 
                    q.clear(); 
                    break;
            } 
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
    sc.close();
    }
}
