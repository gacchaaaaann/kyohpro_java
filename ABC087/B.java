package ABC087;

import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a= scan.nextInt(),b= scan.nextInt(),c= scan.nextInt(),x= scan.nextInt();
        x/=50;

        int n=0,y=0;  /* n:答え */

        for ( int i = 0; i<=a && 10*i<=x; i++ ){  /* 500円玉の数，既定の枚数と金額も超えなければよい  */

            for ( int j=0; j<=b && 10*i+2*j<=x; j++ ){  /* 100円玉の数，既定の枚数と金額を超えなければよい */

                if( (y=x-(10*i+2*j)) <= c )  n++;  /* 残りを５０円玉でちゃんと補完できるなら組み合わせとして成立するのでカウント */

            }
        }

        System.out.println(n);

    }
}
