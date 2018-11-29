/**
 * BubbleSort
 */
public class BubbleSort {
    public static int[] arr = {16, 4, 10, 90, 27, 3, 12, 28};
    public static int n = arr.length;
    public static int temp = 0;
    public static void main(String[] args) {
        Sorting();
        ShowArray();
    }

    public static void Sorting(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n-1); j++) {
                if(arr[j] > arr[j+1]){
                    Swap(j);
                }
            }
        }
    }

    public static int Swap(int j){
        temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
        return 0;
    }

    public static void ShowArray(){
        System.out.print("Hasil pengurutan : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}