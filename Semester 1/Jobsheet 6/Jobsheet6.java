import java.util.Scanner;
public class Jobsheet6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, sum, i, a, b;
        sum = 0;
        i = 2;
        
        System.out.println("Masukkan angka : ");
        N = sc.nextInt();        
        
        b = 0;
        do{
            if(N%2 != 0){
                sum += 1;
            }
            
            N = N/10;
            System.out.println(N);
        }while(N>0);
        
        System.out.println("Banyak bilangan ganjil pada bilangan tersebut adalah : " + sum);
    }
}
