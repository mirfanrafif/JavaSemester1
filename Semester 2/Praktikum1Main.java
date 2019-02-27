import java.util.Scanner;
public class Praktikum1Main {
    public static void main(String[] args) {
        minMax[] arr1 = new minMax[5];
        arr1[0] = new minMax();
        
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) 
        {
            arr1[i] = new minMax();
            System.out.println("Nilai array indeks ke-"+i);
            System.out.print("Masukkan nilai : ");
            arr1[i].nilaiArray = sc.nextInt();
        }
        
        int min = arr1[0].nilaiArray;
        int max = arr1[0].nilaiArray;
        
        for (int i = 1; i < 5; i++) {
            if (arr1[i].nilaiArray < min) {
                min = arr1[i].nilaiArray;
            }else{
                max = arr1[i].nilaiArray;
            }
        }
        
        System.out.println("Brute Force");
        System.out.println("Nilai minimal : "+ min);
        System.out.println("Nilai maksimal : "+ max);
        

        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = arr1[i].nilaiArray;
        }
        
        maxMin hasil = new maxMin();
        
        minMax.max_min(arr, 0, 4, hasil);
        
        System.out.println("Divide Conquer");
        System.out.println("Nilai minimal : " + hasil.min + "\nNilai Maksimal "
                + ": " + hasil.max);
        System.out.print("\n");
        
        
    }
}
