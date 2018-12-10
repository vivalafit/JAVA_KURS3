package Pr2;



public class Point {
    private int x;             // number of rows
    private int y;             // number of columns
    // create M-by-N matrix of 0's
    public Point(int x, int y) {
        this.x = x;
        this.y = y;

    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
