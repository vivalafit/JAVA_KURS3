package Pr2;

import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.security.SecureRandom;

public class TextHandler {
    static BufferedReader br = null;
    static SecureRandom sr = new SecureRandom();
    public static void main(String[] args) {
        br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Point> p1 = new HashSet<Point>();
        p1.add(new Point(2, 3));
        p1.add(new Point(2, 4));
        p1.add(new Point(5, 1));
        p1.add(new Point(2, 5));
        p1.add(new Point(3, 1));
        p1.add(new Point(4, 1));
        p1.add(new Point(5, 1));
        for (Point s : p1) {
            System.out.println("\nСписок дистанций от прямой : "+s.getX()+" : "+s.getY());
        }
        //
        int a = 1;
        int b = 1;
        int c = 1;
        System.out.println("Наше уравнение прямой : "+a+"x + "+b+"y + "+c+" = 0");
        Point fixedPoint = CountCoords();
        System.out.println("Решение  : "+a+"*"+fixedPoint.getX()+" + "+b+"*"+fixedPoint.getY()+" + "+c+" = 0");
        System.out.println("Наша точка \nX :"+fixedPoint.getX()+"\nY : "+fixedPoint.getY());
        //
        p1.add(fixedPoint);
        //
        int furthestid=0;
        double furthestdis=0;
        int counter =0;
        for (Point s : p1) {
            double distance = calculate_distance(fixedPoint.getX(),fixedPoint.getY(),s.getX(),s.getY());
            System.out.println("\nСписок дистанций от прямой : "+distance);
        }
        for (Point s : p1) {
            counter++;
            if(calculate_distance(fixedPoint.getX(),fixedPoint.getY(),s.getX(),s.getY())>furthestdis)
            {
                furthestid = counter;
                furthestdis = calculate_distance(fixedPoint.getX(),fixedPoint.getY(),s.getX(),s.getY());
            }

        }
        System.out.println("\nСамая дальняя точка от прямой: "+furthestid);
        System.out.println("Дистанция : "+furthestdis);
    }
    public static double calculate_distance (float x1,float y1,float x2 ,float y2){
        return Math.sqrt((((x1-x2) * (x1-x2)) + ((y1- y2) * (y1- y2))));
    }
    public static Point CountCoords () {
     int testX =  sr.nextInt(10 + 1 + 10) - 10;
     int testY =  sr.nextInt(10 + 1 + 10) - 10;
     return new Point(testX,testY);
    }
    public int compare(Point o1, Point o2) {
        return o1.getX()- o2.getX();
    }
}
