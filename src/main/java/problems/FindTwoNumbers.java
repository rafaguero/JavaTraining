package problems;

import java.util.*;

public class FindTwoNumbers {

    private static List<String> findTwoNumbers(int[]numbers1, int[]numbers2, int target){
        Map<String,Integer> sumMap = new HashMap<>();
        for(int i=0; i<numbers1.length;i++){
            for(int j=0;j<numbers1.length;j++){
                sumMap.put(numbers1[i] + "," +numbers2[j],numbers1[i]+numbers2[j]);
            }
        }
        Set<String> keys = sumMap.keySet();
        String pair1 = null;
        String pair2 = null;
        int counter1 =0;
        int counter2 =-1;
        while(pair1 == null || pair2 == null){
            if(pair1 == null) {
                pair1 = findTarget(target + counter1++, sumMap);
            }
            if (pair2 == null){
                pair2 = findTarget(target+counter2--,sumMap);
            }

        }

        List<String> result = new ArrayList<>();
        result.add(pair1);
        result.add(pair2);
        return result;

    }

    private static String findTarget(Integer target,Map<String,Integer>sumMap){
        Set<Map.Entry<String, Integer>> entries = sumMap.entrySet();
        for (Map.Entry entry: entries){
            if (entry.getValue() == target){
                return (String) entry.getKey();
            }
        }
        return null;

    }

    public static void main(String[] args) {
        System.out.println("find two numbers" + findTwoNumbers(new int[]{-1,3,8,2,9,5}, new int[]{4, 1, 2, 10, 5, 20},15));
    }
}
