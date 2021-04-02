package com.perez.java;

public class CheckSecond {


        public int getMax(int x, int y)
        {
            return ( x>y?x:y);
        }

        public int findSecondMaximum(int[] arr)
        {
            int firstMax = arr[0];
            int secondMax= arr[1];
            for (int i=0;i<arr.length;i++){
                for (int j = 0; j < arr.length;j++){
                    if ( i == j) {
                        continue;
                    }

                    firstMax = getMax(arr[i],firstMax);

                }
            }
            //System.out.println("first Max is " + firstMax);


            return arr[0];
        }



    }



