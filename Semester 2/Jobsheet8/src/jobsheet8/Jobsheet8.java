package jobsheet8;
import java.util.Scanner;
public class Jobsheet8 {
    public static void main(String[] args) {
        int dataIn;
        Scanner sc = new Scanner(System.in);
        int pil = 0;
        System.out.println("Max antrian : ");
        int m = sc.nextInt();
        Queue qobj = new Queue(m);
        
        do {
            menu();
            pil = sc.nextInt();
            switch(pil){
                case 1:
                    System.out.println("Masukkan data baru = ");
                    dataIn = sc.nextInt();
                    qobj.enQueue(dataIn);
                    break;
                case 2:
                    int dataOut = qobj.deQueue();
                    if (dataOut!=0) {
                        System.out.println("Data yang terambil : " + dataOut);
                    }
                    break;
                case 3:
                    qobj.print();
                    break;
                case 4:
                    qobj.printFront();
                    break;
                case 5:
                    qobj.printRear();
                    break;
                case 6:
                    System.out.println("Masukkan data yang dicari = ");
                    dataIn = sc.nextInt();
                    qobj.printPosition(dataIn);
                    break;
                case 7:
                    System.out.println("Masukkan data yang dicari = ");
                    dataIn = sc.nextInt();
                    qobj.printDatabyPos(dataIn);
                    break;
            }
        } while (pil!=4);
        
    }
    
    static void menu(){
        System.out.println("Operasi : ");
        System.out.println("Enqueue");
        System.out.println("DeQueue");
        System.out.println("Print");
        System.out.println("Keluar");
        System.out.println("print Front");
        System.out.println("print Rear");
        System.out.println("print Position");
        System.out.println("print data by Position");
    }
    
}
