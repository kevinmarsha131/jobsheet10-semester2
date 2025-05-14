public class Mahasiswa13 {
    String nim, nama, kelas;
    double ipk;
    public Mahasiswa13() {
        
    }
    public Mahasiswa13(String nm, String name, String kls, double ip) {
        this .nim = nm;
        this.nama = name;
        this.kelas = kls;
        this.ipk = ip;
    }
    public void tampilinformasi() {
        System.out.println("NIM : " + nim + "\tNama : " + nama + "\tKelas : " + kelas + "\tIPK : " + ipk);
    }  
}