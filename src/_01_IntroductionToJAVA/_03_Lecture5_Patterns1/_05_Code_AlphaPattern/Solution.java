package _01_IntroductionToJAVA._03_Lecture5_Patterns1._05_Code_AlphaPattern;

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
            char ch = (char) ('A' + currRow - 1);
            while(currCol <= currRow) {

                System.out.print(ch);
                currCol += 1;
            }
            System.out.println();
            currRow += 1;
        }
    }
}

//Code : Alpha Pattern

//Print the following pattern for the given N number of rows.
//Pattern for N = 3
// A
// BB
// CCC

//Input format :
//Integer N (Total no. of rows)

//Output format :
//Pattern in N lines

//Constraints
//0 <= N <= 26

//Sample Input 1:
//7

//Sample Output 1:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
//GGGGGGG

//Sample Input 2:
//6

//Sample Output 2:
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF