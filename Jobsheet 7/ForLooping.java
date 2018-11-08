import java.util.Random;
import java.util.Scanner;


public class ForLooping{
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        char menu='y';
        do {
            int number=random.nextInt(10)+1;
            boolean success=false;
            do {
                System.out.print("Tebak angka 1-10 : ");
                int answer = sc.nextInt();
                sc.nextLine();
                success=(answer==number);
                if(answer>number){
                    System.out.println("jawaban anda lebih dari tebakan");
                }else if(answer<number){
                    System.out.println("jawaban anda kurang dari tebakan");
            }
            } while (!success);
            System.out.println("apakah anda ingin mengulangi lagi?");
            menu=sc.findInLine(".").charAt(0);
            System.out.print("");
        } while (menu=='y' ||menu=='Y');
    }
}
    