package problems.amazon;

import java.lang.reflect.Array;
import java.util.*;

import static java.util.Map.Entry.comparingByKey;
import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.toMap;

public class PopularNFeatures {
    public static void main(String[] args) {
        List<String>possibleFeatures = Arrays.asList("anacell","betacellular","cetracular","deltacellular","eurocell");
        List<String>featureRequests = Arrays.asList("i love anacell anacell","betacellular has great ","deltacellular has ","cetracular is worse","betacellular is better than deltacellular");
        ArrayList<String>result = popularNFeatures(5,2, possibleFeatures,3,featureRequests);
        System.out.println(result);
    }
    public static ArrayList<String> popularNFeatures(int numFeatures, int topFeatures, List<String> possibleFeatures,int numFeatureRequests,
                                                     List<String>featureRequests){
        Map<String,Integer> result = new HashMap<>();
        for (String feature:featureRequests){
           for (String possibleF:possibleFeatures){
               if (feature.toLowerCase().contains(possibleF.toLowerCase())){
                   if ( result.containsKey(possibleF)){
                       result.replace(possibleF,result.get(possibleF)+1);
                   }else {
                       result.put(possibleF,1);
                   }
               }
           }
       }
        //sort by value first
        Map<String, Integer> sortedResult = result
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                //.sorted(comparingByKey())
                .collect(
                        toMap(e -> e.getKey(), e -> e.getValue(), (e1, e2) -> e2,
                                LinkedHashMap::new));
        List<String>tempResult = new ArrayList<>();
        List<String> feature = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : sortedResult.entrySet()) {
            feature.add(entry.getKey());
        }
        if (topFeatures > possibleFeatures.size()){
            return (ArrayList<String>) feature;
        }

        for (int i = 0;i < topFeatures;i++){
            tempResult.add(feature.get(i));
        }
        return (ArrayList<String>) tempResult;
    }
}
