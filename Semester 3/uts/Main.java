package PBO.uts;

public class Main {
    public static void main(String[] args) {
        Car mCar = new Car(new Engine("Gasoline"));
        mCar.setMaxSpeed(10);
        System.out.println("Max Speed : " + mCar.getMaxSpeed());
        mCar.increaseSpeed();
        mCar.increaseSpeed();
        mCar.increaseSpeed();
        mCar.increaseSpeed();
        mCar.increaseSpeed();
        System.out.println("Speed : " + mCar.getSpeed());

        mCar = new Car(new Engine("Diesel"));
        mCar.setMaxSpeed(5);
        System.out.println("Max Speed : " + mCar.getMaxSpeed());
        mCar.increaseSpeed();
        mCar.increaseSpeed();
        mCar.increaseSpeed();
        mCar.increaseSpeed();
        mCar.increaseSpeed();
        System.out.println("Speed : " + mCar.getSpeed());



    }
}
