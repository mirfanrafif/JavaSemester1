package PBO.Jobsheet6.Percobaan1;

public class ClassA {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void getNilai () {
        System.out.println("Nilai x : " + x);
        System.out.println("Nilai y : " + y);
    }
}
