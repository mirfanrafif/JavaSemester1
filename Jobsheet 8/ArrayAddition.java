import java.util.Scanner;
public class ArrayAddition{
    public static void main(String[] args) {
        int[] arr1 = new int[3];
        int[] arr2 = new int[3];
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i < 3; i++){
            System.out.print("Masukkan angka arr1 : ");
            arr1[i] = sc.nextInt();
            sum = sum + arr1[i];
        }
        
        System.out.println("Jumlah arr1 adalah : "+ sum);

        for(int i = 0; i < 3; i++){
            System.out.print("Masukkan angka arr2 : ");
            arr2[i] = sc.nextInt();
            sum = sum + arr2[i];
        }
        
        System.out.println("Jumlah semua angka tersebut adalah : "+ sum);

    }
}