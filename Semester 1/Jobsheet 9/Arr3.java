/**
 * Arr3
 */
import java.util.Scanner;
public class Arr3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [][] nilai = new int [2][3];

        int i = 0, j = 0;
        while (i<2) {
            do {
                System.out.print("Masukkan nilai ke-["+i+"]["+j+"] : ");
                nilai[i][j] = input.nextInt();        
                j++;
            } while (j<3);
            System.out.println("---------------------");
            j = 0;
            i++;
        }
        
        System.out.println("---------------------");

        i = 0;
        
        
        do  {
            j = 0;
            while (j<3) {
                System.out.print(nilai[i][j]+ " ");
                j++;
            }
            i++;
            System.out.println();
        } while(i<2);
    }
}