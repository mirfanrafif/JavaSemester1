public class Faktorial {
    public int nilai, hasil;
    
    public int FaktorialBP(int n){
        nilai = n;
        int faktor = 1;
        for (int i = 1; i <= n; i++) {
            faktor = faktor * i;
            
        }
        return faktor;
    }
    
    public int FaktorialDC(int n){
        nilai = n;
        if (n==1) {
            return 1;
        }
        else{
            int faktor = n * FaktorialDC(n-1);
            return faktor;
        }
    }
}
