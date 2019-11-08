package Jobsheet9.Tugas;

public class Test {
    public static void main(String[] args) {
        WalkingZombie walkingZombie = new WalkingZombie(100, 1);
        JumpingZombie jumpingZombie = new JumpingZombie(100, 2);
        Barrier barrier = new Barrier(100);

        Plant p = new Plant();
        System.out.println("" + walkingZombie.getZombieInfo());
        System.out.println("" + jumpingZombie.getZombieInfo());
        System.out.println("" + barrier.getBarrierInfo());
        System.out.println("------------------------------------");
        for (int i = 0; i < 4; i++) {
            p.doDestroy(walkingZombie);
            p.doDestroy(jumpingZombie);
            p.doDestroy(barrier);
        }

        System.out.println("" + walkingZombie.getZombieInfo());
        System.out.println("" + jumpingZombie.getZombieInfo());
        System.out.println("" + barrier.getBarrierInfo());


    }
}
