//Nomor 3

import java.util.Scanner;
public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int n = sc.nextInt();
        
        for (int Tinggi = 0; Tinggi < 1; Tinggi++) {
            for (int Panjang = 0; Panjang < n; Panjang++) {
                System.out.print(n+" ");
            }
            System.out.println("");
        }
        for (int Tinggi = 1; Tinggi < n-1; Tinggi++) {
            for (int Panjang = 0; Panjang < 1; Panjang++) {
                System.out.print(n+ " ");
            }
            for (int Panjang = 1; Panjang < n-1; Panjang++) {
                System.out.print("  ");
            }
            for (int Panjang = n-1; Panjang < n; Panjang++) {
                System.out.print(n+ " ");
            }
            System.out.println("");
        }
        
        for (int Tinggi = n-1; Tinggi < n; Tinggi++) {
            for (int Panjang = 0; Panjang < n; Panjang++) {
                System.out.print(n+" ");
            }
            System.out.println("");
        }
        
    }
}
