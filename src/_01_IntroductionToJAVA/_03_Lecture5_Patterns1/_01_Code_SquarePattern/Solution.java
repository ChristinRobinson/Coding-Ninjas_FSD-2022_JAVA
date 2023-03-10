package _01_IntroductionToJAVA._03_Lecture5_Patterns1._01_Code_SquarePattern;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        /* Your class should be named Solution.
         * Read input as specified in the question.
         * Print output as specified in the question.
         */

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int currRow = 1;
        while(currRow <= n) {

            int currCol = 1;
            while(currCol <= n) {

                System.out.print(n);
                currCol += 1;
            }
            System.out.println();
            currRow += 1;
        }
    }
}


//Code : Square Pattern

//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//4444
//4444
//4444
//4444

//Input format :
//Integer N (Total no. of rows)

//Output format :
//Pattern in N lines

//Constraints
//0 <= N <= 50

//Sample Input 1:
//7

//Sample Output 1:
//7777777
//7777777
//7777777
//7777777
//7777777
//7777777
//7777777

//Sample Input 1:
//6

//Sample Output 1:
//666666
//666666
//666666
//666666
//666666
//666666