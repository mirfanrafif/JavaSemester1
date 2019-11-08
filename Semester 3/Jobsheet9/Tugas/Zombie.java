package Jobsheet9.Tugas;

public class Zombie implements Destroyable{
    protected int health;
    protected int level;

    @Override
    public void destroyed() {

    }

    public void heal(){

    }

    public String getZombieInfo(){
        return "Health : " + health + "\nLevel : " + level + "\n";
    }
}
