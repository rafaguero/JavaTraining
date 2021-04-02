package com.perez.java.diffproblems;


import java.util.*;

public class MachinesSchedule {

    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(2, 0);
        Point p3 = new Point(0, 1);
        Point p4 = new Point(2, 1);
        Point p5 = new Point(3, 1);
        Point p6 = new Point(2, 2);
        Point p7 = new Point(3, 2);
        Point p8 = new Point(2, 3);
        List<Point> row0 = new ArrayList<>();
        List<Point> row1 = new ArrayList<>();
        List<Point> row2 = new ArrayList<>();
        List<Point> row3 = new ArrayList<>();
        row0.add(p1);
        row0.add(p2);
        row1.add(p3);
        row1.add(p4);
        row1.add(p5);
        row2.add(p6);
        row2.add(p7);
        row3.add(p8);
        List<List<Point>> allRows = new ArrayList<>();
        allRows.add(row0);
        allRows.add(row1);
        allRows.add(row2);
        allRows.add(row3);


        MachinesSchedule mySchedule = new MachinesSchedule();
        List<Point> resultSchedule = mySchedule.getMachineSchedule(allRows);
        Iterator iter = resultSchedule.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next().toString());
        }
    }

    private List<Point> getMachineSchedule(List<List<Point>> table) {

        List<Point> result = new ArrayList<>();

        for (List<Point> row : table){
            Object[] pointsArray = (row.toArray());
            Object[] resultArray = (result.toArray());
            if (result.isEmpty()){
                processLeftToRight(row,result);
            }else {
                int d1 = getDistanceBetweenTwoPoints((Point)resultArray[resultArray.length-1],(Point)pointsArray[0]);
                int d2 = getDistanceBetweenTwoPoints((Point)resultArray[resultArray.length-1],(Point)pointsArray[pointsArray.length-1]);
                if (d1 < d2){
                    processLeftToRight(row,result);
                }else{
                    processRightToLeft(pointsArray,result);
                }
            }
        }

        return result;
    }

    private int getDistanceBetweenTwoPoints(Point p1, Point p2){
        int xP1 = p1.getX();
        int yP1 = p1.getY();
        int xP2 = p2.getX();
        int yP2 = p2.getY();
        int distance = yP1 + yP2 + Math.abs(xP1 - xP2);
        return distance;
    }

    private void processLeftToRight(List<Point>row,List<Point>result){
        for (Point p:row){
            result.add(p);
        }
    }

    private void processRightToLeft(Object[] row,List<Point>result){

            for (int x = row.length-1; x>=0; x--) {
                Point p = (Point) row[x];
                result.add(p);
            }
        }
}
