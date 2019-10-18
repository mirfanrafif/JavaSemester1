package PBO.Jobsheet7;

public class Segitiga {
    private int sudut;

    public int totalSudut(int sudutA){
        sudut = 180-sudutA;
        return sudut;
    }

    public int totalSudut(int sudutA, int sudutB){
        sudut = 180 - (sudutA + sudutB);
        return sudut;
    }

    public int keliling (int sisiA, int sisiB, int sisiC){
        int keliling = sisiA + sisiB + sisiC;
        return keliling;
    }

    public double sisiMiring(int sisiA, int sisiB){
        double c = Math.sqrt((sisiA*sisiA) + (sisiB * sisiB));
        return c;
    }


}
