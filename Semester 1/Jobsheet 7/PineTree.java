//Nomor 5

public class PineTree {
    public static void main(String[] args) {
        int n = 5;
        int Asterisk = (n*2)-1;
        for (int Jumlah = 1; Jumlah <= n; Jumlah++) {
            Asterisk=1;
            for (int Tinggi = 0; Tinggi < n; Tinggi++) {
                for (int Space = n- Tinggi; Space > 0; Space--) {
                    System.out.print(" ");
                }
                for (int Panjang = 0; Panjang < Asterisk; Panjang++) {
                    System.out.print("*");
                }
                Asterisk+=2;
                System.out.println("");
            }
        }
    }
}
