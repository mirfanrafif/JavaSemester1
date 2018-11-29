class Tugas1{
    public static void main(String[] args) {
        int Result = Max3(5, 89, 7);
        System.out.println(Result);
    }

    public static int Max3 (int bil1, int bil2, int bil3){
        int max = 0;
        if (bil1 > bil2 && bil1 > bil3) {
            max = bil1;
        } else if(bil2 > bil1 && bil2 > bil3){
            max = bil2;
        }else{
            max = bil3;
        }
        return max;
    }
}