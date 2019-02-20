/**
 * Tugas4
 */
public class Tugas4 {

    public static void main(String[] args) {
        System.out.println(fibonacci(9));
        System.out.println(fibonacciIter(9));
    }

    public static int fibonacci(int n)  {
        if(n==0 || n == 1){
            return n;
        }
        else{
            return fibonacci(n - 1) + fibonacci(n - 2);
            
        }
        
    }

    public static int fibonacciIter(int n){
        int a = 0;
        int b = 1;
        int sum = 0;
        
        for (int i = 1; i < n; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.print(a+ " + ");
        }

        return sum;


    }
}