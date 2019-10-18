package PBO.Jobsheet6.Tugas;

public class Main {
    public static void main(String[] args) {
        Mac mac = new Mac("MacBook", "Intel", 4, 4000, "Li-Ion", "1234");
        Windows windows = new Windows("Acer", "Intel", 4, 4000, "Li-Ion", "Game");
        PC pc = new PC("Lenovo", "Intel", 5, 8000, 20);

        mac.tampilmac();
        windows.tampilWindows();
        pc.tampilPC();
    }
}
