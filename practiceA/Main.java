package practiceA;

import org.omg.CORBA.portable.InputStream;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int num = 0, sum = 0;

        Scanner scan = new Scanner(System.in);

        for ( int n = 0; n<3; n++ ){
            num = scan.nextInt();
            sum += num;

        }

        String str = scan.next();

        System.out.println( sum + " " + str );

    }
}
