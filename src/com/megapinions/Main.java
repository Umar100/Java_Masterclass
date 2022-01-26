package com.megapinions;

import printer.Printer;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(20, true);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed = " + pagesPrinted + " and new total print count for print = " + printer.getPagesPrinted());
        pagesPrinted=printer.printPages(2);
        System.out.println("Pages printed = " + pagesPrinted + " and new total print count for print = " + printer.getPagesPrinted());
    }
}
