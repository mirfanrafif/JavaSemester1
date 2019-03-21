public class Stack {
    int size;
    int top;
    int[] data;

    public Stack(int size) {
        this.size = size;
        data = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (top == size-1){
            return true;
        }else{
            return false;
        }
    }

    public void push(int dt) {
        if (!isFull()){
            top++;
            data[top] = dt;
        }else {
            System.out.println("===============================");
            System.out.println("Isi sudah penuh");
        }
    }

    public void pop() {
        if (!isEmpty()){
            int a = data[top];
            top--;
            System.out.println("Data yang di pop : "+a);
        }else{
            System.out.println("===============================");
            System.out.println("Tidak dapat pop. Data masih kosong.");
        }
    }

    public void tampilkan() {
        System.out.println("Isi stack");
        for (int i = top; i >=0; i--) {
            System.out.println("[" + data[i] + "]");
        }
    }

    public void clearStack() {
        if (!isEmpty()){
            for (int i = top; i >= 0; i++) {
                top--;
            }
            System.out.println("===============================");
            System.out.println("Stack dikosongkan");
        }else{
            System.out.println("=================================");
            System.out.println("Tidak dapat dihapus. Stack masih kosong");
        }
    }
}
