import java.util.Scanner;
public class ReversedArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] Number = new int[4];

        for(int i = 0; i < 4; i++){
            System.out.println("Masukkan angka ke-"+i);
            Number[i] = sc.nextInt();
        }
        for(int i = 3; i >= 0; i--){
            System.out.println("Angka ke-"+i+" adalah :"+ Number[i]);
        }
    }
}