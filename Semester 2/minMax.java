public class minMax {
    public int nilaiArray, min, max;
   
    public static void max_min(int[] arr, int indeksAwal, 
            int indeksAkhir, 
            maxMin hasil){
        int indeksTengah;
        maxMin hasil1 = new maxMin();
        maxMin hasil2 = new maxMin();
        
        if (indeksAwal == indeksAkhir) {
            hasil.min = hasil.max = arr[indeksAwal];
        }else if (indeksAkhir - indeksAwal == 1 ) {
            if (arr[indeksAwal] > arr[indeksAkhir]) {
                hasil.min = arr[indeksAkhir];
                hasil.max = arr[indeksAwal];
            }else{
                hasil.min = arr[indeksAwal];
                hasil.max = arr[indeksAkhir];
            }
        }else{
            indeksTengah = (indeksAwal + indeksAkhir) / 2;
            max_min(arr, indeksAwal, indeksTengah, hasil1);
            max_min(arr, indeksTengah + 1, indeksAkhir, hasil2);
            
            hasil.min = (hasil1.min < hasil2.min)  ? hasil1.min : hasil2.min;
            hasil.max = (hasil1.max > hasil2.max)  ? hasil1.max : hasil2.max;
            
        }
    }
    
    
}
