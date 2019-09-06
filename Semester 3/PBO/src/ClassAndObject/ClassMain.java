package ClassAndObject;

public class ClassMain {
    public static void main(String[] args) {
        SepedaMotor sepedaMotor = new SepedaMotor("Yamaha", 0);

        sepedaMotor.tambahKecepatan();
        sepedaMotor.tambahKecepatan();
        sepedaMotor.tambahKecepatan();
        sepedaMotor.tambahKecepatan();

        sepedaMotor.tampilkanData();

        sepedaMotor.kurangiKecepatan();
        sepedaMotor.kurangiKecepatan();
        sepedaMotor.kurangiKecepatan();

        sepedaMotor.tampilkanData();


    }
}
