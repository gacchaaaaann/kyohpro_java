package ABC081;

import java.util.Scanner;

import static java.lang.System.exit;

public class B_retry {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(),x=30;  /* n=N, x=現時点の最小の操作可能数( 10^9 < 2^30 ) */

        for ( int i=0; i<n; i++ ){  /* i+1個めのAの入力 */

            int a = scan.nextInt();  /* a=Ai */
            if( a % Math.pow(2,x) == 0) continue; /* aが現時点で最小の操作可能数分だけ操作できるならそれ以上操作できても関係ないので無視 */

            int y=0;  /* 今回のaにおいて可能な操作数を調べて累積していく用 */

            for( y=0; a%2==0; y++ )  a/=2;

            if( y<x ) x = y;
            else exit(1);

        }

        System.out.println(x);
    }
}


/* ****************
* 面倒くさいことやらずにとりあえずひたすら割らせた
* 実行時間変わんなかった
* ケッ*
 ******************/