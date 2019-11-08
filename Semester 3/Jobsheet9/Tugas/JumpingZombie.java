package Jobsheet9.Tugas;

public class JumpingZombie extends Zombie {
    public JumpingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (level){
            case 1: health += 30; break;
            case 2: health += 40; break;
            case 3: health += 50; break;
        }
    }

    @Override
    public void destroyed() {
        health -= health*10/100;
    }

    @Override
    public String getZombieInfo() {
        return "Jumping Zombie Data : \n" + super.getZombieInfo();
    }
}
