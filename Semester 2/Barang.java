public class Barang {
    String NamaBarang, JenisBarang;
    int Stok, HargaSatuan;
    
    Barang(){
        
    }
    
    Barang(String nm, String jn, int st, int hs){
        NamaBarang = nm;
        JenisBarang = jn;
        Stok = st;
        HargaSatuan = hs;
    }
    
    void TampilBarang(){
        System.out.println("Nama : " + NamaBarang);
        System.out.println("Jenis : " + JenisBarang);
        System.out.println("Stok : " + Stok);
        System.out.println("Harga Satuan : " + HargaSatuan);
    }
    
    void TambahStok(int n){
        Stok = Stok + n;
    }
    
    void KurangiStok(int n){
        if(Stok > 0){
            Stok = Stok - n;
        }
    }
    
    int HargaTotal(int Jumlah){
        return Jumlah*HargaSatuan;
    }
}
