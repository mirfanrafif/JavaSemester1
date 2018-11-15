import java.util.Scanner;
public class Praktikum4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] NilaiAkhir = new int[10];

        for(int i = 0; i < 10; i++){
            System.out.println("Masukkan nilai mahasiswa ke-"+i+" :");
            NilaiAkhir[i] = sc.nextInt();
        }

        for(int i = 0; i < 10; i++){
            if(NilaiAkhir[i]>70){
                System.out.println("Mahasiswa "+i+" lulus");
            }
            else{
                System.out.println("Mahasiswa "+i+" lulus");
            }
        }

    }
}