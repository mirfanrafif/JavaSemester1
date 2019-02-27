package jobsheet2;
public class NilaiMhs {
    int nilai1, nilai2;
    
    int nilaiTertinggi(){
        if (nilai1 >= nilai2) {
            return nilai1;
        }
        else{
            return nilai2;
        }
    }
}
