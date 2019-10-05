package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] names = new String[3];
        names[0] = "Anna";
        names[1] = "Masha";
        names[2] = "Vicky";
        names = Arrays.copyOf(names, names.length + 1);
        names[3]="Nike";




        for (int i = 0; i < names.length; i++) {
            switch (i) {

                case 0:
                    System.out.println(names[0] + "  Good morning");
                    break;
                case 1:
                    System.out.println(names[1] + "   Good day");
                    break;
                case 2:
                    System.out.println(names[2] + "   Good evening");
                    break;
                case 3:
                    System.out.println(names[3] + "   Good night");
                    break;


            }

        }


    }
}
