public class PrimeNumber {
    public static void main(String[] args) {
        int input = 7;
        int a=0;
        
        for (int i = 2; i < 999999999; i++) {
            boolean isPrima = true;
            for (int j = 2; j < i; j++) {
                if (i%j==0) {
                    isPrima = false;
                    break;
                }
            }if(isPrima==true){
                System.out.print(i + " ");
                a++;
            }
            if(a==input){
                break;
            }
        }
        
    }
}
