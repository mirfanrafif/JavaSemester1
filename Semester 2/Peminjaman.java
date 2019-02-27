public class Peminjaman {
    String Nama, ID, NamaGame;
    int LamaPinjam, HargaSewa;
    
    Peminjaman(String n, String id, String Game, int Lama, int Harga1){
        Nama = n;
        ID = id;
        NamaGame = Game;
        LamaPinjam = Lama;
        HargaSewa = Harga1;
    }
    
    int Tagihan(int n){
        n = LamaPinjam;
        return n*HargaSewa;
    }
    
    void TampilPeminjam(){
        System.out.println("Nama : "+ Nama);
        System.out.println("ID : "+ ID);
        System.out.println("Nama Game : " + NamaGame);
        System.out.println("Lama Pinjam : " + LamaPinjam);
        System.out.println("Tagihan : " + Tagihan(LamaPinjam));
    }
}
