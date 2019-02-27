public class Tugas3Main {
    public static void main(String[] args) {
        Tugas3 Pembeli1 = new Tugas3();
        
        Pembeli1.nama = "Adi";
        Pembeli1.jumlah = 12;
        Pembeli1.hargaSatuan = 10000;
        
        Pembeli1.HargaTotal = Pembeli1.hitungHargaTotal();
        System.out.println("Total tagihan "+ Pembeli1.nama + " adalah " + Pembeli1.HargaTotal);
        
    }
}
