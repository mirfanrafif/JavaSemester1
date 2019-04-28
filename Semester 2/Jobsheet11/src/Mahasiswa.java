public class Mahasiswa {
    
    String nama;
    int nilai;
    
    public Mahasiswa(String nm, int n) {
        this.nama = nm;
        this.nilai = n;
    }
    
    void print(){
        System.out.println("Nama : " + nama);
        System.out.println("Nilai : " + nilai);
    }
    
}
