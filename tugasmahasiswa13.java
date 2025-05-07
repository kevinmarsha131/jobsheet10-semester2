public class tugasmahasiswa13 {
    String nim, nama, prodi;

    public tugasmahasiswa13(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    public String toString() {
        return nim + " - " + nama + " - " + prodi;
    }
}