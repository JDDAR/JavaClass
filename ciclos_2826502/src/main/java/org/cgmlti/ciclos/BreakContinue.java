package org.cgmlti.ciclos;

public class BreakContinue {

    public static void main(String[] args) {
        // ciclo controlado por contador
        /*
         * for (int i = 0; i < 10; i++) {
         * System.out.println(i);
         * if (i == 5) {
         * break;
         * }
         * }
         */

        int y = 8;
        int x = 5;

        System.out.println("A");

        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");

            } else {
                System.out.println("#####");

            }
            System.out.println("$$$$$");
            System.out.println("&&&&&");
        }

        System.out.println("B");

        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");

            } else {
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");

            }

        }

        System.out.println("C");

        if (y == 8) {
            if (x == 5) {
                System.out.println("@@@@@");
                System.out.println("$$$$$");

            } else {
                System.out.println("#####");

                System.out.println("&&&&&");
            }
        }

        System.out.println("D");

        int a = 8;
        int c = 7;

        if (a == 8) {
            if (c == 5) {
                System.out.println("@@@@@");

            } else {
                System.out.println("#####");
                System.out.println("$$$$$");
                System.out.println("&&&&&");
            }
        }
    }
}
