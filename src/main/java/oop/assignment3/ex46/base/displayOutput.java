package oop.assignment3.ex46.base;

public class displayOutput {

    public void output(int count, int a, int b, int c){         //Prints the appropriate word from most frequency to least frequent
        switch (count) {
            case 1 -> {
                printStar(a, "badger:");
                printStar(b, "mushroom:");
                printStar(c, "snake:");
            }
            case 2 -> {
                printStar(a, "badger:");
                printStar(c, "snake:");
                printStar(b, "mushroom:");
            }
            case 3 -> {
                printStar(b, "mushroom:");
                printStar(a, "badger");
                printStar(c, "snake");
            }
            case 4 -> {
                printStar(b, "mushroom:");
                printStar(c, "snake:");
                printStar(a, "badger:");
            }
            case 5 -> {
                printStar(c, "snake:");
                printStar(a, "badger:");
                printStar(b, "mushroom:");
            }
            case 6 -> {
                printStar(c, "snake:");
                printStar(b, "mushroom:");
                printStar(a, "badger:");
            }
        }
    }

    public static void printStar(int frequency, String word){   //Prints a star for each occurrence of a word

        System.out.printf("%-10s", word);
        while(frequency > 0){
            System.out.print("*");
            frequency--;
        }
        System.out.println("");

    }
}
