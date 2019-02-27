public class Pacman {
    int x, y, width, height;
//    Atribut x digunakan untuk menyimpan posisi koordinat x (mendatar) dari pacman, sedangkan atribut y untuk posisi koordinat y (vertikal)
//      Atribut width digunakan untuk menyimpan lebar dari area	permainan, sedangkan height untuk menyimpan panjang area
    
    void moveLeft(){
        if (x-1>0&&x<width) {
            x = x-1;
        }else{
            System.out.println("Anda di pinggir. tidak bergerak.");
        }
    }
    
    void moveRight(){
        if (x>0&&x+1<width) {
            x = x+1;
        }else{
            System.out.println("Anda di pinggir. tidak bergerak.");
        }
    }
    
    void moveUp(){
        if (y>0&&y+1<height) {
            y = y+1;
        }else{
            System.out.println("Anda di pinggir. tidak bergerak.");
        }
    }
    
    void moveDown(){
        if (y-1>0&&y<height) {
            y = y-1;
        }else{
            System.out.println("Anda di pinggir. tidak bergerak.");
        }
    }
    
    void printPosition(){
        System.out.println("anda berada di :");
        System.out.println("x = "+ x);
        System.out.println("y = "+ y);
        System.out.println("Ukuran lapangan : "+width + "x"+ height);
    }
    
    Pacman(int panjang, int lebar, int posisiX, int posisiY){
        width = panjang;
        height = lebar;
        x = posisiX;
        y = posisiY;
    }
}

