


package com;

import java.util.Scanner;

public class circumferenceAreaRectangle {
    public static void circumferenceArea() {
        circumferenceAndAreaRectangle();
    }
    private static void circumferenceAndAreaRectangle() {

        int width, height, perimeter, area;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the width of the rectangle ");
        width = scan.nextInt();
        System.out.println("Please enter the height of the rectangle ");
        height = scan.nextInt();
        perimeter = 2 * height + 2 * width;
        area = width * height;
        System.out.println("The circumference of the rectangle is:  " + perimeter);

        System.out.println("The area of the rectangle is: " + area);
    }
}



