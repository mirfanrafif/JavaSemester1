import java.util.Scanner;
public class InputArray{
    public static void main(String[] args){
        int[] bil = new int[10];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 7; i++){
            System.out.println("Masukkan angka ke-"+i);
            bil[i] = sc.nextInt();
        }
        for(int i = 0; i < 7; i++){
            System.out.println("Angka ke-"+i+" adalah :"+ bil[i]);
        }

    }
}