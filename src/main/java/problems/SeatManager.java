package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class SeatManager {

    private Map<Integer,String> seats = new HashMap<>();
    private int n = 0;

    public SeatManager(int n){
        this.n=n;
        for (int i=1;i<n+1;i++){
            seats.put(i,"available");
        }
    }

    public int reserve(){

        for(int i=1;i<=this.n;i++){
            String status = seats.get(i);
            if (status.equalsIgnoreCase("available")){
                seats.put(i,"reserved");
                return i;
            }
        }
        return -1;
    }

    public void unreserve(int seat){
        seats.put(seat,"available");
    }

    public static void main(String[] args) {
        SeatManager seatManager = new SeatManager(10);
        seatManager.reserve();
        System.out.println(seatManager.reserve());
    }


    /*
    rafaeltperez@yahoo.com
    SeatManager(int n) Initializes a SeatManager object that will manage n seats numbered from 1 to n. All seats are initially available.

    int reserve() Fetches the smallest-numbered unreserved seat, reserves it, and returns its number.

     void unreserve(int seatNumber) Unreserves the seat with the given seatNumber.

     */


}
