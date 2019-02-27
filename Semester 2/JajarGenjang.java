package jobsheet2;
public class JajarGenjang {
    double panjang, tinggi, sisiMiring;
    
    double hitungLuas(){
        return panjang * tinggi;
    }
    
    double hitungKeliling(){
        sisiMiring = Math.sqrt((panjang*panjang)+(tinggi*tinggi));
        return 2*(panjang+tinggi);
    }
}
