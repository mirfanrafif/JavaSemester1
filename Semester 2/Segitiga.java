public class Segitiga {
    public double Alas;
    public double Tinggi;
    
    public Segitiga(double a, double t){
        Alas = a;
        Tinggi = t;
    }
    
    double HitungLuas(){
        double Luas = Alas * Tinggi / 2;
        return Luas;
    }
    
    double HitungKeliling(){
        double miring = Math.sqrt((Alas*Alas) + (Tinggi*Tinggi));
        double Keliling = Alas + Tinggi + miring;
        return Keliling;
    }
}
