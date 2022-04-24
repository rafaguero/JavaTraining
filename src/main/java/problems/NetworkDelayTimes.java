package problems;

public class NetworkDelayTimes {
    public static int networkDelayTime(int[][] times, int n, int k) {
        int totTime = 0;
       //int [][] time = {{2,1,1},{2,3,1},{3,4,1}};
       // n =4 k=2
        for (int row = 0; row < times.length;row++){
            if (times[row][0] == k){
                totTime = times[row][2] + totTime;
            }
        }
        if (totTime == 0){
            return -1;
        }
        return totTime;
    }

    public static void main(String[] args) {
        /*
        ou are given a network of n nodes, labeled from 1 to n. You are also given times,
         a list of travel times as directed edges times[i] = (ui, vi, wi), where ui is the source node, vi
         is the target node, and wi is the time it takes for a signal to travel from source to target.
         We will send a signal from a given node k. Return the time it takes for all the n nodes to receive the signal.
         If it is impossible for all the n nodes to receive the signal, return -1.
         Input: times = [[2,1,1],[2,3,1],[3,4,1]], n = 4, k = 2
         Output: 2
         */
        int [][] time = {{2,1,1},{2,3,1},{3,4,1}};
        System.out.println(networkDelayTime(time,4,2));
        //[[1,2,1]], n = 2, k = 2
        int [][] time2 = {{1,2,1}};
        System.out.println(networkDelayTime(time2,2,2));
        //Input: times = [[1,2,1]], n = 2, k = 1
        //Output: 1
        System.out.println(networkDelayTime(time2,2,1));

    }
}
