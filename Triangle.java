package com;

import java.util.Scanner;

public class Triangle {
    public static void triangle() {
        trian();
    }

    private static void trian() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the X coordinate value of the" +
                " first point:  ");
        int firstX = scan.nextInt();
        System.out.println("Please enter the Y  coordinate value of the" +
                " first point:  ");
        int firstY = scan.nextInt();
        System.out.println("Please enter the X coordinate value of the" +
                " second point:  ");
        int secondX = scan.nextInt();
        System.out.println("Please enter the Y  coordinate value of the" +
                " second point:  ");
        int secondY = scan.nextInt();
        System.out.println("Please enter the X coordinate value of the" +
                " third  point:  ");
        int thirdX = scan.nextInt();
        System.out.println("Please enter the Y  coordinate value of the" +
                " third  point:  ");
        int thirdY = scan.nextInt();
        double disFirstSecond = Math.sqrt(Math.pow(firstX - secondX, 2) + Math.pow(firstY - secondY, 2));
        double disFirstThird = Math.sqrt(Math.pow(firstX - thirdX, 2) + Math.pow(firstY - thirdY, 2));
        double disSecondThird = Math.sqrt(Math.pow(secondX - thirdX, 2) + Math.pow(secondY - thirdY, 2));
        if (disFirstSecond == disFirstThird && disFirstThird == disSecondThird)
            System.out.println("Equilateral triangle");
        else if (disFirstSecond == disFirstThird || disFirstSecond == disSecondThird
                || disFirstThird == disSecondThird)
            System.out.println("Isosceles triangle");
        else System.out.println("Triangle");

    }
}