package problems.arrays;

import java.util.*;

public class InterceptOfTwoArrays {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map  =new HashMap<>();
        for(int n : nums1)
        {
            map.put(n, map.getOrDefault(n,0)+1);
        }
        List<Integer> res = new ArrayList<>();
        for(int n: nums2)
        {
            if(map.getOrDefault(n,0)>0)
            {
                res.add(n);
                map.put(n, map.get(n)-1);
            }
        }

        int[] resarr = new int[res.size()];
        for(int i = 0; i < res.size(); i++)
        {
            resarr[i] = res.get(i);
        }
        return resarr;

    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{4,0,5,1};
        int [] nums2 = new int[]{9,5,9,8,0,4};
        //nums1 = [4,9,5], nums2 = [9,4,9,8,4]
        int[] result = intersect(nums1,nums2);
        System.out.println(Arrays.toString(result));
    }
}
