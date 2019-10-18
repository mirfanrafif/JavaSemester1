package PBO.jobsheet4.percobaan2;

public class Car {
    private String name;
    private int cost;

    public Car() {
    }

    public Car(String name, int cost) {
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

    public int carCostCalculation(int day){
        return cost * day;
    }


}
