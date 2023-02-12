package _01_IntroductionToJAVA._04_Lecture6_Patterns2._03_Code_StarPattern;


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

            int space = 1;
            while(space <= n - currRow) {

                System.out.print(" ");
                space += 1;
            }

            int currCol = 1;
            while(currCol <= (2 * currRow) - 1) {

                System.out.print("*");
                currCol += 1;
            }
            System.out.println();
            currRow += 1;
        }
    }
}



//Code : Star Pattern

//Print the following pattern,
//Pattern for N = 4

//The dots represent spaces.
//    *
//   ***
//  *****
// *******

//Input Format :
//N (Total no. of rows)

//Output Format :
//Pattern in N lines

//Constraints :
//0 <= N <= 50


//Sample Input 1 :
//3

//Sample Output 1 :
//   *
//  ***
// *****

//Sample Input 2 :
//4

//Sample Output 2 :
//    *
//   ***
//  *****
// *******