import java.util.Scanner;
class BiodataTandaPetik{
	public static void main(String[] args){
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		int NIM;
		String Nama, Kelas, Alamat;
		System.out.print("Masukkan NIM : ");
		NIM = scInt.nextInt();
		System.out.print("Masukkan Nama : ");
		Nama = scString.nextLine();
		System.out.print("Masukkan Kelas : ");
		Kelas = scString.nextLine();
		System.out.print("Masukkan Alamat : ");
		Alamat = scString.nextLine();
		
		System.out.println("\"======================================\"");
		System.out.println("\"NIM : \"" + NIM + "\"");
		System.out.println("\"Nama : \"" + Nama + "\"");
		System.out.println("\"Kelas : \"" + Kelas + "\"");
		System.out.println("\"Alamat : \"" + Alamat + "\"");
	}
}