import java.util.Scanner;
class BiodataDanNilai{
	public static void main(String[] args){
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		int tingkat, bilanganBulat;
		String nama, kelas, karakter;
		double bilanganPecahan;

		nama = "Moch. Irfan Rafif";
		tingkat = 1;
		kelas = "A";
		bilanganBulat = 10;
		bilanganPecahan = 3.33333;
		karakter = "C";

		System.out.println("Nama saya" + nama + ", seorang mahasiswa polinema kelas " +tingkat+kelas + ".");
		System.out.println("Saya sedang belajar menampilkan nilai :");
		System.out.println("Bilangan Bulat\t\t : " +bilanganBulat);
		System.out.println("Bilangan Pecahan\t : " +bilanganPecahan);
		System.out.println("Karakter\t\t : " +karakter);
	}
}