package jobsheet.pkg5;
public class Pelanggaran {
    public static void main(String[] args) {
        
        boolean Pelanggaran = true;
        boolean SIM = false;
        boolean STNK = true;
        
        if(Pelanggaran == true){
            if(SIM == true){
                if(STNK == true){
                    System.out.println("Anda tidak kena tilang");
                }else{
                    System.out.println("Anda kena tilang");
                }
            }else{
                System.out.println("Anda kena tilang");
            }
        }else{
            System.out.println("Anda kena tilang");
        }

    }
}