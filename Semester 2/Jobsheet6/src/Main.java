import java.util.Scanner;

public class Main {
    static int sequentialSearch(int [] arr, int x){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x){
                return i;
            }
        }

        return -1;
    }

    static void bubbleSort(int [] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static int binarySearch(int arr[], int x){
        int awal = 0;
        int akhir = arr.length-1;

        while(awal <= akhir ){
            int tengah = awal + (akhir - awal) / 2;
            if (arr[tengah] == x){
                return tengah;
            }else if(arr[tengah] < x){
                awal = tengah+1;
            }else{
                akhir = tengah-1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        //deklarasi variabel dan array
        int [] data = {12, 5, 30, 25, 40, 7, 9};
        int cari = 40;
        int hasil;

//        //pencarian dengan sequential search
//        hasil = sequentialSearch(data, cari);

        //bubble sort dan binary search
        bubbleSort(data);
        hasil = binarySearch(data, cari);

        if(hasil == -1){
            System.out.println("Pencarian tidak ketemu");
        }else{
            System.out.println("Pencarian ketemu di index ke-"+hasil);
        }

    }
}
