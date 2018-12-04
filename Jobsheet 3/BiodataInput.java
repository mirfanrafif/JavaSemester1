import java.util.Scanner;
class BiodataInput {
	public static void main(String[] args){
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		int Usia, TinggiBadan;
		String Nama, NoHP;
		System.out.print("Masukkan Nama : ");
		Nama = scString.nextLine();
		System.out.print("Masukkan No. HP : ");
		NoHP = scString.nextLine();
		System.out.print("Masukkan Usia : ");
		Usia = scInt.nextInt();
		System.out.print("Masukkan Tinggi Badan : ");
		TinggiBadan = scInt.nextInt();

		System.out.println("=============================================");
		System.out.println("Nama : \"" + Nama + "\"");
		System.out.println("No. HP : \"" + NoHP + "\"");
		System.out.println("Usia : \"" + Usia+ "\"");
		System.out.println("Tinggi Badan : \"" + TinggiBadan+ "\"");
	}
}