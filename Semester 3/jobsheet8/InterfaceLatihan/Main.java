package Semester3.jobsheet8.InterfaceLatihan;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Rektor pakRektor = new Rektor();

        Mahasiswa mahasiswaBiasa = new Mahasiswa("Charlie");
        Sarjana sarjanaCumlaude = new Sarjana("Dini");
        Pascasarjana masterCumlaude = new Pascasarjana("Elok");

        sarjanaCumlaude.kuliahDiKampus();

//        pakRektor.beriSertifikatCumlaude(mahasiswaBiasa);
//        pakRektor.beriSertifikatCumlaude(sarjanaCumlaude);
//        pakRektor.beriSertifikatCumlaude(masterCumlaude);

        pakRektor.beriSertifikatMawapres(sarjanaCumlaude);
        pakRektor.beriSertifikatMawapres(masterCumlaude);


    }
}
