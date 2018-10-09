package ABC081;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        char[] ch = str.toCharArray();

        int count = 0;

        for ( int i=0; i<ch.length; i++ )  if ( ch[i]== '1') count++;

        System.out.println(count);
    }
}
