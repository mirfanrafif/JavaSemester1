//Nomor 1

import java.util.Scanner;
public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int n = sc.nextInt();
        
        for (int Outer = 1; Outer <= n; Outer++) {
            for (int Space = Outer; Space < n; Space++) {
                    System.out.print(" ");
                }
            for (int i = 1; i <= Outer; i++) {
                System.out.print(i);
            }
            System.out.println("");
        }
    }
}