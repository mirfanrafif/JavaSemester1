import java.util.Scanner;
class Segitiga {
	public static void main(String[] Args){
		float alas, tinggi, luas;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan Alas :");
		alas = scanner.nextInt();
		System.out.print("Masukkan Tinggi :");
		tinggi = scanner.nextInt();
		luas = alas*tinggi/2;
		System.out.print("Luas = " + luas);
	}
}