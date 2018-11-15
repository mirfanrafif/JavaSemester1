import java.util.Scanner;

public class ArrayMax {

    public static void main(String[] args) {
        int max = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang array ; ");
        int n = sc.nextInt();
        int[] number = new int[n];

        for (int i = 0; i < number.length; i++) {
            System.out.print("Masukkan angka : ");
            number[i] = sc.nextInt();
        }

        for (int i = 0; i < number.length; i++) {
            if (number[i]>max) {
                max = number[i];
            }
        }

        System.out.println("Angka tertinggi adalah : "+ max);
    }
}