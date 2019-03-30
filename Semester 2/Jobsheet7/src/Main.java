import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Masukkan besar stack : ");
//        int size = sc.nextInt();
//        Stack tumpuk = new Stack(size);
//        boolean loop = true;
//        while (loop){
//            System.out.println(
//                    "\n1. Push \n" +
//                    "2. Pop \n" +
//                    "3. Tampil \n" +
//                    "4. Clear \n" +
//                    "5. Berhenti \n"
//                    );
//            int pilih = sc.nextInt();
//            switch (pilih){
//                case 1:
//                    System.out.println("Masukkan data :");
//                    int dt = sc.nextInt();
//                    tumpuk.push(dt);
//                    break;
//                case 2:
//                    tumpuk.pop();
//                    break;
//                case 3:
//                    tumpuk.tampilkan();
//                    break;
//                case 4:
//                    tumpuk.clearStack();
//                    break;
//                case 5:
//                    loop = false;
//            }
//        }

        String p, q;
        System.out.println("Masukkan ekspresi : ");
        q = sc.nextLine();
        q = q.trim();
        q = q + ")";

        int total = q.length();
        PostFix pf = new PostFix(total);
        p = pf.convert(q);
        System.out.println("Postfix:\n" + p);
    }
}
