import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan panjang array : ");
        int panjang = sc.nextInt();

        int [] arr = new int [panjang];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Masukkan array indeks ke-"+ i + " : ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Masukkan bilangan yang dicari : ");
        int x = sc.nextInt();

        int hasil = seqSearch(arr, x);
        if (hasil != -1){
            System.out.println("Pencarian ketemu di indeks ke-" + hasil);
        }else{
            System.out.println("Pencarian tidak ketemu");
        }

    }

    static int seqSearch(int [] array, int cari){
        for (int i = 0; i < array.length; i++) {
            if (array[i]==cari){
                return i;
            }
        }

        return -1;
    }
}
