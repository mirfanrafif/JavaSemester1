package PBO.uts;

public class Engine {

    private String fuelUsed;

    public Engine(String fuelUsed) {
        this.fuelUsed = fuelUsed;
    }

    public String getFuelUsed() {
        return fuelUsed;
    }

    public void setFuelUsed(String fuelUsed) {
        this.fuelUsed = fuelUsed;
    }

    public int enginePower(){
        if (fuelUsed.equals("Gasoline")){
            return 100;
        }else if (fuelUsed.equals("Diesel")){
            return 80;
        }else{
            return 50;
        }
    }
}
