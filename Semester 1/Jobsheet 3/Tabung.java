import java.util.Scanner;
public class Tabung {
	public static void main(String[] args) {
		Object Object1 = new Object();
		Object1.r=3;
		Object1.t=10;
		Object1.pi=3.14f;
		Object1.L = Object1.r * Object1.r * Object1.t * Object1.pi;

		System.out.println("Volume Tabung = " + Object1.L);
	}
}