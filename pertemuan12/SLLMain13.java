public class SLLMain13 {
    public static void main(String[] args) {
        
        SingleLinkedList13 sll = new SingleLinkedList13();
        Mahasiswa13 mhs1 = new Mahasiswa13("212212200", "Alvaro", "1A", 4.0);
        Mahasiswa13 mhs2 = new Mahasiswa13("212212201", "Bimon", "2B", 3.8);
        Mahasiswa13 mhs3 = new Mahasiswa13("212212202", "Cintia", "3C", 3.5);
        Mahasiswa13 mhs4 = new Mahasiswa13("212212203", "Dirga", "4D", 3.6);
        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1); 
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.addLast(mhs1);
        sll.print();

        System.out.println("data index - 1 : ");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index : " + sll.indexof("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
