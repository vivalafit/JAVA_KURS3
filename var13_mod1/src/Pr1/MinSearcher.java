package Pr1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinSearcher {
    static BufferedReader br = null;
    public static void main(String[] args) {
        System.out.println("Developed by Vlad");
        br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please, input N: ");
        byte input;
        try {
            input = Byte.parseByte(br.readLine());
            Matrix matrix = Matrix.random(input,input);

            System.out.println("Our matrix");
            matrix.show();
            byte min[]  = matrix.getMinimumOfEveryColumn();
            System.out.println("Min element :" + min[0] + " pos i: " + min[1] + " pos j: "+min[2]+"\n");
            byte posX = 2;//Set your position (for X) to move element where you want
            byte posY = 2;//Set your position (for Y) to move element where you want
            System.out.println("Move min element to " + "(x: "+posX + ", y: "+posY+")");
            matrix.setPos(min,posX,posY);
            matrix.show();
            min = matrix.getMinimumOfEveryColumn();
            System.out.println("Now our min element("+ min[0]+") has next pos : " + " pos i: " + min[1] + " pos j: "+min[2]);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e){
            System.out.println("Invalid input");
        }
    }


}
