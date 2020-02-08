package problems.amazon;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ActiveInactive {
    public static void main(String[] args) {
        List<Integer> result = cellCompete(new int[]{1,0,1,0,1,0,0,1},2);
        System.out.println("The result is " + result);
    }
    public static List<Integer> cellCompete(int[] states, int days){


        int[] tempStates = new int[states.length];

        for (int i = days; i > 0; i--){
            if ( i != days){
                states = tempStates;
                tempStates = new int[states.length];
            }
            for ( int j = 0;j < states.length; j++){
                if (j == 0 ){
                    if ( states[j+1] == 0){
                        tempStates[j] = 0;
                    }else
                        tempStates[j] = 1;
                } else if ( j == states.length - 1){
                    if (states[j-1] == 0 ){
                        tempStates[j] = 0;
                    }else
                        tempStates[j] = 1;
                } else if ( (states[j-1] == 0 && states[j+1] == 0) || (states[j-1] == 1 && states[j+1] == 1)  ){
                    tempStates[j] = 0;
                }else
                    tempStates[j] = 1;

            }
        }
        ArrayList<Integer> result = IntStream.of(tempStates).boxed().collect(Collectors.toCollection(ArrayList::new));
        return result;
    }
}
