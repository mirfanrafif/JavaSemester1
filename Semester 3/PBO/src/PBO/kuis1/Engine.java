package PBO.kuis1;

public class Engine {
    private String brand;
    private double speed;

    public Engine() {
    }

    public String getBrand() {
        return brand;
    }

    public double getSpeed() {
        return speed;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

     public void increaseSpeed(){
        if (brand.equals("Yamaha")){
            if (speed < 120){
                if (speed + 15 < 120){
                    speed += 15;
                }else {
                    speed += (120 - speed);
                }
            }
        }else if (brand.equals("Honda")){
            if (speed < 100){
                if (speed + 10 < 100){
                    speed += 10;
                }else {
                    speed += (100 - speed);
                }
            }
        }
    }

    public void reduceSpeed(){
        if (brand.equals("Yamaha")){
            if (speed >0){
                if (speed - 10 > 0){
                    speed -= 10;
                }else{
                    speed -= speed;
                }
            }
        }else if (brand.equals("Honda")){
            if (speed > 0){
                if (speed -5 > 0){
                    speed -= 5;
                }else{
                    speed -= speed;
                }
            }
        }
    }
}
