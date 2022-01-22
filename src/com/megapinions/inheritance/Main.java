package com.megapinions.inheritance;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("EliteBook", "HP", "240", dimensions);

        Monitor monitor = new Monitor("27inch Beast", "HP", 27, new Resolution(2540, 1440));
        MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, monitor, motherBoard);

        thePC.getMonitor().drawPixelAt(1500, 1300, "Red");
    }
}
