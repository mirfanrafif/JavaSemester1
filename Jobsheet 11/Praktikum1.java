public class Praktikum1{
    public static void main(String[] args) {
        System.out.println(HitungFaktorialRekursif(5));
        System.out.println(HitungFaktorialIteratif(5));
    }
    static int HitungFaktorialRekursif (int n) {
        if(n>1){
            return n * HitungFaktorialRekursif(n-1);
        }else{
            return 1;
        }
    }

    static int HitungFaktorialIteratif(int n){
        int fakt = 1;
        for (int i = n; n >= 1; n--) {
            fakt = fakt * n;
        }
        return fakt;
    }
}