public class NestedLoopNo5 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Iterasi Outer Loop ke " + i);
            System.out.println("i " + i);
            for (int r = 1; r <= 1; r++) {
                System.out.println("Iterasi Inner Loop ke " + r);
                System.out.println("r " + r);
            }
        }
    }
}
