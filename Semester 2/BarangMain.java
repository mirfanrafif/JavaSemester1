public class BarangMain {
    public static void main(String[] args) {
        Barang b1 = new Barang();
        b1.NamaBarang = "Corsair 2 GB";
        b1.JenisBarang = "DDR";
        b1.HargaSatuan = 250000;
        b1.Stok = 10;
        b1.TambahStok(1);
        b1.KurangiStok(3);
        b1.TampilBarang();
        int HitungHargaTotal = b1.HargaTotal(4);
        System.out.println("Harga 4 Buah = " + HitungHargaTotal);
        Barang b2 = new Barang("Logitech", "Wireless Mouse", 150000, 25);
        b2.TampilBarang();
        Barang b3 = new Barang("Votre", "Keyboard", 25000, 1000);
    }
}
