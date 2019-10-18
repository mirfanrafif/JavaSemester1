package PBO.jobsheet4.percobaan2;

public class Driver {
    private String name;
    private int cost;

    public Driver() {
    }

    public Driver(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int driverCostCalculation(int day){
        return cost * day;
    }
}
