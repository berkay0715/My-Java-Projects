package day17_While_DoWhileLoops;

import day15_ForLoop.ForLoopIntro;

public class DoWhileLoopIntro {
    public static void main(String[] args) {
        boolean a = false;

        for (int i = 0;a;){
            System.out.println("Wooden Spoon -- for loop");
        }
        System.out.println("----------------------------------------");
        while (a){
            System.out.println("wooden spoon -- while loop");
        }

        System.out.println("------------------------------------------");

        do {
            System.out.println("wooden spoon-- do -while loop");
        }while (a);
    }
}
