import java.util.Scanner;
public class GamePacman {
    public static void main(String[] args) {
        int arahGerak;
        Pacman p1 = new Pacman(15,20,1,1);
        Scanner sc = new Scanner(System.in);
        int gerak = 1;
        while(gerak == 1){
            p1.printPosition();
        System.out.println("Pilih arah berjalan : ");
        System.out.println("1. Atas \n2. Kiri\n3. Bawah\n4. Kanan");
        arahGerak = sc.nextInt();
        switch(arahGerak){
            case(1):
                p1.moveUp();
                break;
            case(2):
                p1.moveLeft();
                break;
            case(3):
                p1.moveDown();
                break;
            case(4):
                p1.moveRight();
                break;
        }
        }
        
        
    }
}
