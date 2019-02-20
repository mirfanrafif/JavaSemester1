import java.util.Scanner;
public class ArraySum{
    public static void main(String[] args) {
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        for(int i = 0; i < 3; i++){
            System.out.print("Masukkan angka arr1 : ");
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Jumlah semua angka tersebut adalah : "+ sum);

    }
}