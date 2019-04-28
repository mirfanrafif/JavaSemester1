import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        Scanner sc = new Scanner(System.in);
        Scanner scLine = new Scanner(System.in);
        int pil = 0;
        int idx, nilai;
        Mahasiswa dataIn;
        String nm;
        try {
        while (pil!=9) {            
            Menu();
            pil = sc.nextInt();
            switch(pil){
                case 1:
                    System.out.println("Masukkan nama :");
                    nm = scLine.nextLine();
                    System.out.println("Masukkan nilai : ");
                    nilai = sc.nextInt();
                    dataIn = new Mahasiswa(nm, nilai);
                    dll.addFirst(dataIn);
                    break;
                case 2:
                    System.out.println("Masukkan nama :");
                    nm = scLine.nextLine();
                    System.out.println("Masukkan nilai : ");
                    nilai = sc.nextInt();
                    dataIn = new Mahasiswa(nm, nilai);
                    dll.addLast(dataIn);
                case 3:
                    System.out.println("Masukkan nama :");
                    nm = scLine.nextLine();
                    System.out.println("Masukkan nilai : ");
                    nilai = sc.nextInt();
                    dataIn = new Mahasiswa(nm, nilai);
                    System.out.println("Masukkan index :");
                    idx = sc.nextInt();
                    dll.add(dataIn, idx);
                    break;
                case 4:
                    dll.removeFirst();
                    break;
                case 5:
                    dll.removeLast();
                    break;
                case 6:
                    System.out.println("Masukkan index :");
                    idx = sc.nextInt();
                    dll.remove(idx);
                    break;
                case 7:
                    dll.print();
                    break;
                case 8:
                    System.out.println("Masukkan index :");
                    idx = sc.nextInt();
                    dll.get(idx);
                    break;
                case 10:
                    dll.BubbleSort();
                    dll.print();
                    break;
                    
            }
        }    
        } catch (Exception e) {
        }
        
    }
    
    public static void Menu(){
        System.out.println("DOUBLE LINKED LIST DENGAN MENU");
        System.out.println("==============================");
        System.out.println("MENU");
        System.out.println("1. Tambah Awal");
        System.out.println("2. Tambah Akhir");
        System.out.println("3. Tambah pada Index Tertentu");
        System.out.println("4. Hapus Awal");
        System.out.println("5. Hapus Akhir");
        System.out.println("6. Hapus Index Tertentu");
        System.out.println("7. Cetak Data");
        System.out.println("8. Cari");
        System.out.println("9. Keluar");
        System.out.println("==============================");
    }
}
