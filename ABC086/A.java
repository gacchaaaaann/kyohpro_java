package ABC086;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        if ((scan.nextInt() % 2) == 1 && (scan.nextInt() % 2) == 1) System.out.println("Odd");
        else System.out.println("Even");

    }

}
