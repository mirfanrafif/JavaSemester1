package PBO.jobsheet4.percobaan2;

public class MainPercobaan2 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setName("Avanza");
        c.setCost(350000);

        Driver d = new Driver();
        d.setName("John Doe");
        d.setCost(200000);

        Customer p = new Customer();
        p.setCar(c);
        p.setDriver(d);
        p.setDay(2);
        System.out.println("Total Cost : " + p.totalCostCalculation());
    }
}
