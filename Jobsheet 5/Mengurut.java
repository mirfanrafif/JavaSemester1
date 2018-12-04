/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jobsheet.pkg5;
import java.util.Scanner;
/**
 *
 * @author Irfan Rafif
 */
public class Mengurut {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int Bilangan1, Bilangan2, Bilangan3;
        int BilanganBesar, BilanganTengah, BilanganKecil;
        
        System.out.print("Masukkan bilangan pertama : ");
        Bilangan1 = sc.nextInt();
        System.out.print("Masukkan bilangan kedua : ");
        Bilangan2 = sc.nextInt();
        System.out.print("Masukkan bilangan ketiga : ");
        Bilangan3 = sc.nextInt();
        
        if(Bilangan1 > Bilangan2 && Bilangan1 > Bilangan3){
            BilanganBesar = Bilangan1;
            System.out.println("Bilangan terbesar adalah " + Bilangan1);
        }else if(Bilangan2 > Bilangan1 && Bilangan2 > Bilangan3){
            BilanganBesar = Bilangan2;
            System.out.println("Bilangan terbesar adalah " + Bilangan3);
        }else if(Bilangan3 > Bilangan1 && Bilangan3 > Bilangan2){
            BilanganBesar = Bilangan3;
            System.out.println("Bilangan terbesar adalah " + Bilangan3);
        }
        if(Bilangan1 < Bilangan2 && Bilangan1 < Bilangan3){
            BilanganKecil = Bilangan1;
            System.out.println("Bilangan terkecil adalah " + Bilangan1);
        }else if(Bilangan2 < Bilangan1 && Bilangan2 < Bilangan3){
            BilanganKecil = Bilangan2;
            System.out.println("Bilangan terkecil adalah " + Bilangan3);
        }else if(Bilangan3 < Bilangan1 && Bilangan3 < Bilangan2){
            BilanganKecil = Bilangan3;
            System.out.println("Bilangan terkecil adalah " + Bilangan3);
        }
    }
}
