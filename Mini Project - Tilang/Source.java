public class Source {
    public void InputNama(){
        System.out.print("Masukkan nama pengendara : ");
    }
    public void InputNoPol(){
        System.out.print("Masukkan nopol kendaraan : ");
    }
    public void Pembuka(){
        System.out.println("--------------------------------");
        System.out.println("       Aplikasi tilang          ");
        System.out.println("       Polda Jawa Timur         ");
        System.out.println("            2018                ");
        System.out.println("--------------------------------");
    }
    public void TidakValid(){
        System.out.println("Input tidak valid");
        
    }
    public void PertanyaanSIM(){
        System.out.println("Apakah pengendara berumur 17 th \ndan memiliki SIM?\n1 untuk ya, 0 untuk tidak");
    }
    public void PertanyaanBawaSIM(){
        System.out.println("Apakah pengendara membawa SIM?\n1 untuk ya, 0 untuk tidak");
    }
    public void PertanyaanBawaSTNK(){
        System.out.println("Apakah pengendara membawa SIM?\n1 untuk ya, 0 untuk tidak");
    }
    public void PertanyaanSTNK(){
        System.out.println("Apakah pengendara membawa STNK?\n1 untuk ya, 0 untuk tidak");
    }
    public void PertanyaanPlatNomor() {
        System.out.println("Apakah pengendara membawa motor dengan \nplat nomor yang standar?\n1 untuk ya, 0 untuk tidak");
    }
    public void PertanyaanPartMotor(){
        System.out.println("Apakah motor menggunakan aksesoris tidak sesuai standar?\n1 untuk ya, 0 untuk tidak");
    }
    public void PertanyaanPartMobil(){
        System.out.println("Apakah mobil menggunakan aksesoris tidak sesuai standar?\n1 untuk ya, 0 untuk tidak");
    }
    public void PertanyaanSerepMobil(){
        System.out.println("Apakah motor membawa segitiga pengaman\ndan ban serep?\n1 untuk ya, 0 untuk tidak");
    }
    public void MenggunakanHelm(){
        System.out.println("Apakah pengendara menggunakan helm?\n1 untuk ya, 0 untuk tidak");
    }
    public void LampuMalamHari(){
        System.out.println("Apakah pengendara menyalakan lampu pada malam hari?\n1 untuk ya, 0 untuk tidak");
    }
    public void LampuMotorSiangHari(){
        System.out.println("Apakah pengendara motor menayalakan lampu besar saat siang?");
    }
    public void Riting(){
        System.out.println("Apakah pengendara menyalakan lampu sein saat belok?\n1 untuk ya, 0 untuk tidak");
    }
    public void Menu(){
        System.out.println("\n\n--------------------------------");
        System.out.println("Menu : ");
        System.out.println("1. SIM");
        System.out.println("2. STNK");
        System.out.println("3. Plat Nomor");
        System.out.println("4. Spare Part / Aksesoris Motor");
        System.out.println("5. Spare Part / Aksesoris Mobil");
        System.out.println("6. Ban Serep dan Segitiga Pengaman");
        System.out.println("7. Helm untuk Pengendara Motor");
        System.out.println("8. Lampu Kendaraan saat Malam Hari / Cuaca Buruk / Kabut");
        System.out.println("9. Lampu motor saat siang hari");
        System.out.println("10. Lampu sein / Riting saat berbelok");
        System.out.println("11. Total Denda");
        System.out.print("Pilih menu : ");
    }
    public void PilihanLain(){
        System.out.println("Apakah ada kasus lain?\nY/N");
    }
    public void Batas(){
        System.out.println("--------------------------------");
    }
}