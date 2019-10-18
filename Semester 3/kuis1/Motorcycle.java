package PBO.kuis1;

public class Motorcycle {
    private Engine engine;
    private String motorCycleBrand;

    public Motorcycle(String motorCycleBrand, String engineBrand) {
        this.engine = new Engine();
        engine.setBrand(engineBrand);
        this.motorCycleBrand = motorCycleBrand;
    }

    public String getEngineBrand() {
        return engine.getBrand();
    }

    public String getMotorCycleBrand() {
        return motorCycleBrand;
    }

    public void setMotorCycleBrand(String motorCycleBrand) {
        this.motorCycleBrand = motorCycleBrand;
    }

    public void increaseMotorcycleSpeed(){
        engine.increaseSpeed();
        System.out.println(engine.getSpeed() + " Km/jam");
    }

    public void reduceMotorcycleSpeed(){
        engine.reduceSpeed();
        System.out.println(engine.getSpeed() + " Km/jam");
    }
}
