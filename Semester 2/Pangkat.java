public class Pangkat {
    int x, n, res = 1;
    
    public int pangkatBruteForce(){
        for (int i = 0; i < n; i++) {
            res = res * x;
        }return res;
    }
    
    public void pangkatDivideConquer(int ixAwal, int ixAkhir, PangkatProp 
            hasil){
        int ixTengah;
        PangkatProp hasil1 = new PangkatProp();
        PangkatProp hasil2 = new PangkatProp();
        
        if (ixAkhir == ixAwal) {
            hasil.hasil = x;
        }else if(ixAkhir - ixAwal == 1){
            hasil.hasil = x * x;
        }else{
            ixTengah = (ixAwal + ixAkhir) / 2;
            pangkatDivideConquer(ixAwal, ixTengah, hasil1);
            pangkatDivideConquer(ixTengah +1, ixAkhir, hasil2);
            
            hasil.hasil = hasil1.hasil * hasil2.hasil;
        }
    } 
}
