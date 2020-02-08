package problems;

import java.util.*;

public class  ArrayExercises {
    public static void main(String[] args) {
        int[] numbers3 = {1,3,5,7,9,10};
        int[] numbers2 = {11,13,14,16,17,19};
        int [] numbers1 = {21,23,25,28,31};

        int[] result;
        int[] finalResult;
        int numbers1Length = numbers1.length;
        int numbers2Length = numbers2.length;
        int numbers3Length = numbers3.length;

        int last1 = numbers1[numbers1Length-1];
        int last2 = numbers2[numbers2Length-1];
        int last3 = numbers3[numbers3Length-1];

        if (last1 < last2 && last1 < last3) {
            result = addTwoArrays(numbers1, numbers2);
            finalResult = addTwoArrays(result,numbers3);
            System.out.println("The final array is ");
            printArray(finalResult);
        }else if (last1 > last2 && last1 < last3){
            result = addTwoArrays(numbers2,numbers1);
            finalResult = addTwoArrays(result,numbers3);
            System.out.println("The final array is ");
            printArray(finalResult);
        }else if (last1 > last2 && last1 > last3) {
            result = addTwoArrays(numbers3,numbers2);
            finalResult = addTwoArrays(result,numbers1);
            System.out.println("The final array is ");
            printArray(finalResult);
        }else if ( last1 < last2 && last1 > last3){
            result = addTwoArrays(numbers3,numbers1);
            finalResult = addTwoArrays(result,numbers2);
            System.out.println("the final array is ");
            printArray(finalResult);
        }

        //another way to combine arrays and sort them

        int[] result2 = addTwoArrays(numbers1,numbers2);
        int[] finalResult2 = addTwoArrays(result2,numbers3);
        Arrays.sort(finalResult2);
        printArray(finalResult2);
        //how to remove duplicate numbers from an Array
        System.out.println("remove duplicate numbers from an array");
        Integer[] numbers4 = {11,13,14,16,11,17,19,17};
        Arrays.sort(numbers4);
        System.out.println("Sorted array");
       // printArray(numbers4);
        List<Integer> listNumbers = Arrays.asList(numbers4);
        Set<Integer> setNumbers = new HashSet<>(listNumbers);
        List<Integer> newListNumbers =  new ArrayList<>(setNumbers);
        Collections.sort(newListNumbers);
        System.out.println(newListNumbers);


    //    printArray(uniqueNumbers);


    }

    public static int[] addTwoArrays(int[] array1, int[] array2){

        int totLength = array1.length + array2.length;
        int[] resultArray = new int[totLength];
        int array2Counter = 0;
        for (int i = 0; i<totLength; i++){
             if ( i>= 0 && i < array1.length){
                 resultArray[i] = array1[i];
             }else {

                 resultArray[i] = array2[array2Counter];
                 array2Counter++;
             }
        }
        return resultArray;
    }
    public static void printArray(int[] array){
        for (int i=0;i< array.length;i++)
            System.out.print(array[i] + ",");
        System.out.println("\n done printing");
    }

}
