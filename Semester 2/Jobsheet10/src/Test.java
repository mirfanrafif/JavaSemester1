
public class Test {
    public static void main(String[] args) {
        LinkedList data = new LinkedList();
        try {
            data.addFirst(1);
            data.print();
            data.add(1, 2);
            data.clear();
            data.addFirst(1);
            data.remove(0);
            data.print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
