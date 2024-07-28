package OOP_3_Static;

import java.util.Scanner;

public class MathFuntions {
    static double pi = 3.14;
    static double e=2.71828182846;
    static int tomon1 = 5;
    static  int tomon2 = 5;
    static int tomon3 = 7;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Radiusni kiriting: ");
        int radius = input.nextInt();
        circleArea(radius);
        toDegree(7);
        areaTriangle();


    }

    public static void toDegree(int n){
        System.out.println(Math.pow(e, n));
    }

    public static void areaTriangle(){
        double p = (tomon1 + tomon2 + tomon3) / 2;
        double area = Math.sqrt(p * (p - tomon1) * (p - tomon2) * (p - tomon3));
        System.out.println("Area of " + area);
    }

    public static void circleArea (int radius){
        System.out.println("Area of Circle is equal to "+ pi * Math.pow(radius, 2));
    }
}
