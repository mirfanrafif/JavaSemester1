package Jobsheet9.Tugas;

public class WalkingZombie extends Zombie{
    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void heal(){
        switch (level){
            case 1: health += 20; break;
            case 2: health += 30; break;
            case 3: health += 40; break;
        }
    }

    public void destroyed(){
        health -= health*20/100;
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data : \n" + super.getZombieInfo();
    }
}
