package ocpjp8;

public class Point {
    private int x =0, y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Point(){
        this(0,0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
