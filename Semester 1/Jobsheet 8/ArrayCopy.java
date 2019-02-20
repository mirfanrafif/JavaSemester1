import java.util.Scanner;
public class ArrayCopy{
    public static void main (String[] args){

        int[] arr1 = new int[4];
        int [] arr2 = new int[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 4; i++){
            System.out.print("Masukkan nilai arr 1 : ");
            arr1[i] = sc.nextInt();
        }
        for(int i = 0; i < 4; i++){
            arr2[i] = arr1[i];
        }

        for(int i = 0; i < 4; i++){
            System.out.println("Isi elemen arr2 adalah : " + arr2[i]);

        }
    }
}