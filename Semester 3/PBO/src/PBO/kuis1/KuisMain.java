package PBO.kuis1;

public class KuisMain {
    public static void main(String[] args) {
        Motorcycle honda = new Motorcycle("Vario", "Honda");
        System.out.println(honda.getMotorCycleBrand());
        System.out.println(honda.getEngineBrand());
        honda.increaseMotorcycleSpeed();
        honda.increaseMotorcycleSpeed();
        honda.reduceMotorcycleSpeed();
        honda.reduceMotorcycleSpeed();
        honda.reduceMotorcycleSpeed();
        honda.reduceMotorcycleSpeed();
        honda.reduceMotorcycleSpeed();
        honda.reduceMotorcycleSpeed();

        System.out.println();
        Motorcycle yamaha = new Motorcycle("NMax", "Yamaha");
        System.out.println(yamaha.getMotorCycleBrand());
        System.out.println(yamaha.getEngineBrand());
        yamaha.increaseMotorcycleSpeed();
        yamaha.increaseMotorcycleSpeed();
        yamaha.reduceMotorcycleSpeed();
        yamaha.reduceMotorcycleSpeed();
        yamaha.reduceMotorcycleSpeed();
        yamaha.reduceMotorcycleSpeed();
        yamaha.reduceMotorcycleSpeed();
        yamaha.increaseMotorcycleSpeed();
        yamaha.reduceMotorcycleSpeed();
        yamaha.reduceMotorcycleSpeed();



    }
}
