package Jobsheet9.Tugas;

public class Plant {
    public void doDestroy(Destroyable d){
        if (d instanceof Zombie){
            Zombie zombie = (Zombie) d;
            zombie.destroyed();
        }else if (d instanceof Barrier){
            Barrier barrier = (Barrier) d;
            barrier.destroyed();
        }
    }
}
