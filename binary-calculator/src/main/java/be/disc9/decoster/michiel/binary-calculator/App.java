package be.disc9.decoster.michiel.binary

import java.util.Scanner;

-calculator;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to the binary-calculator");
        System.out.print("Please enter a number you want to calculate: ");
        
        int decimal = console.nextInt();

        


    }
}
