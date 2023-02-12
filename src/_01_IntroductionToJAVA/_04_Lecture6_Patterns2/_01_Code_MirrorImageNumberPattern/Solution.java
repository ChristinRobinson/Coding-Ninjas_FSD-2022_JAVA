package _01_IntroductionToJAVA._04_Lecture6_Patterns2._01_Code_MirrorImageNumberPattern;

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
            int space = 1;
            while(space <= n - currRow) {
                System.out.print(" ");
                space += 1;
            }

            while(currCol <= currRow) {

                System.out.print(currCol);
                currCol += 1;
            }
            System.out.println();
            currRow += 1;
        }
    }
}


//Code : Mirror Image Number Pattern

//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//...1
//..12
//.123
//1234
//The dots represent spaces.


//Input format :
//Integer N (Total no. of rows)

//Output format :
//Pattern in N lines

//Constraints
//0 <= N <= 50


//Sample Input 1:
//3

//Sample Output 1:
//..1
//.12
//123

//Sample Input 2:
//4

//Sample Output 2:
//...1
//..12
//.123
//1234