//Nomor 2


import java.util.Scanner;

public class HourGlass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah angka : ");
        int input = sc.nextInt();
        int Asterisk = (input * 2) - 1;

        for (int Tinggi = 0; Tinggi < input; Tinggi++) {
            for (int Space = Tinggi; Space > 0; Space--) {
                System.out.print(" ");
            }
            for (int Panjang = 0; Panjang < Asterisk; Panjang++) {
                System.out.print("*");
            }
            System.out.println("");
            Asterisk -= 2;
        }
        Asterisk=3; 
        for (int Tinggi = 1; Tinggi < input; Tinggi++) {
            for (int Space = Tinggi; Space < input-1; Space++) {
                System.out.print(" ");
            }
            for (int Panjang = 0; Panjang < Asterisk; Panjang++) {
                System.out.print("*");
            }
            System.out.println("");
            Asterisk+=2;
        }
    }
}
