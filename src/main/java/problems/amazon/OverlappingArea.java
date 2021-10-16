package problems.amazon;

import ocpjp8.Point;

public class OverlappingArea {
    private static int calculateArea(Point rect1,Point rect11, Point rect2, Point rect22){
        if (rect2.getX() > rect1.getX()){
            return 0;
        }
        if(rect22.getY() > rect11.getY()){
            return 0;
        }
        int base = (rect11.getX() - rect2.getX());
        int height = (rect11.getY() - rect2.getY());
        return base * height;
    }
    public static void main(String[] args) {
        Point rect1 = new Point(1,1);
        Point rect11 = new Point(3,3);
        Point rect2 = new Point(2,-3);
        Point rect22 = new Point(4,-1);
        int area = calculateArea(rect1,rect11,rect2,rect22);
        System.out.println("area = " + area);

    }
}
