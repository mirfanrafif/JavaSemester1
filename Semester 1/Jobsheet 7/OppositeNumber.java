//Nomor 4

public class OppositeNumber {
    public static void main(String[] args) {
        int n = 5;
        
        for (int Tinggi = 1; Tinggi <= n; Tinggi++) {
            if (Tinggi%2!=0) {
                for (int Panjang = 1; Panjang <= n; Panjang++) {
                    System.out.print(Panjang);
                }
            }
            if (Tinggi%2==0) {
                for (int Panjang = n; Panjang > 0; Panjang--) {
                    System.out.print(Panjang);
                }
            }
            
            
            System.out.println();
            
        }
    }
}
