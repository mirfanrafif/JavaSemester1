import java.util.Scanner;
public class OddEven{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang array : ");
        int n = sc.nextInt();
        int[] Number = new int[n];
        
        for(int i = 0; i < Number.length; i++){
            System.out.print("Masukkan angka : ");
            Number[i] = sc.nextInt();
        }
        System.out.println("Odd : ");

        for(int i = 0; i < Number.length; i++){
            
            if(Number[i]%2!=0){
                System.out.println(Number[i]);
            }
        }

        System.out.println("Even : ");
        for(int i = 0; i < Number.length; i++){
            if(Number[i]%2==0){
                System.out.println(Number[i]);
            }
        }

    }
}