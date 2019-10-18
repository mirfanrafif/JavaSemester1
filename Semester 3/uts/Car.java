package PBO.uts;

public class Car extends Transportation {
    private Engine mEngine;

    public Car(Engine mEngine) {
        this.mEngine = mEngine;
    }

    public void setMaxSpeed(int maxSpeed) {
        super.setMaxSpeed(
                maxSpeed + mEngine.enginePower()
        );
    }

    public int increaseSpeed() {
        if (super.getSpeed() + 20 < super.getMaxSpeed()) {
            super.setSpeed(
                    getSpeed() + 20
            );
        }
        return getSpeed();
    }
}
