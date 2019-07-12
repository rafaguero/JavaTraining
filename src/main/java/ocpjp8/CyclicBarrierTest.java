package ocpjp8;

import java.sql.SQLOutput;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierTest {
    public static void main(String[] args) {
        System.out.println("reserving tennis court \n As soon as 4 players arrive, game will start");
        CyclicBarrier barrier = new CyclicBarrier(4,new MixedDoubleTennisGame());
        new Player(barrier, "G I Joe");
        new Player(barrier,"Dora the explora");
        new Player(barrier, "Tintin");
        new Player(barrier,"Barbie");
    }

}

class MixedDoubleTennisGame extends Thread {
    public void run(){
        System.out.println("All four players ready, game starts \n love all.");
    }
}

class Player extends Thread {
    CyclicBarrier waitPoint;
    public Player (CyclicBarrier barrier, String name){
        this.setName(name);
        waitPoint = barrier;
        this.start();
    }
    public void run(){
        System.out.println("player " + getName() + " is ready ");
        try{
            waitPoint.await(); //await for all the players to arrive
        }catch(BrokenBarrierException | InterruptedException exception){
            System.out.println("an exception occurred while waiting" + exception);
        }

    }
}

