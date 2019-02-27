public class KaliMatriksBF {
    int [][] bf1 = new int [4][4];
    int [][] bf2 = new int [4][4];
    int [][] res = new int [4][4];
    
    
    public void OperasiBrute(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                for (int k = 0; k < 4; k++) {
                    res[i][j] += bf1[i][k] * bf2[k][j];
                }
            }
        }    
    }
}
