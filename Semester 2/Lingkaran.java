public class Lingkaran {
    double PHI = 3.14, r;
    
    double HitungLuas(int n){
        r = n;
        double Luas = r*r*PHI;
        return Luas;
    }
    
    double HitungKeliling(int n){
        r = n;
        double Keliling = 2*r*PHI;
        return Keliling;
    }
    
}
