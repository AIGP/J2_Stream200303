package ru.gb.jtwo.la.online.circles;

import java.awt.*;

public  class Background {
    public static Color getColor() {
        return new Color((int)r,(int)g,(int)b);
    }
    private static float r = (int) (Math.random() * 255);
    private static float g = (int) (Math.random() * 255);
    private static float b = (int) (Math.random() * 255);

    private static int vTime = 2;
    private static int vR = (int) (Math.random() * 20);
    private static int vG = (int) (Math.random() * 20);
    private static int vB = (int) (Math.random() * 20);

    public static void update(MainCanvas canvas, float deltaTime) {

        r = (r + vR * deltaTime);
        if (r > 255) {
            r = 255;
            vR = -vR;
        }
        if (r < 1) {
            r = 1;
            vR = -vR;
        }
        g =(g + vG * deltaTime);
        if (g > 255) {
            g = 255;
            vG = -vG;
        }
        if (g < 1) {
            g = 1;
            vG = -vG;
        }
        b =  (b + vB * deltaTime);
        if (b > 255) {
            b = 255;
            vB = -vB;
        }
        if (b < 1) {
            b = 1;
            vB = -vB;
        }

    }

}
