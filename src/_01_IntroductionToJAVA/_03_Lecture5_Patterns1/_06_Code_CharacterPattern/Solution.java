package _01_IntroductionToJAVA._03_Lecture5_Patterns1._06_Code_CharacterPattern;

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

                System.out.print((char) (ch + currCol - 1));
                currCol += 1;
            }
            System.out.println();
            currRow += 1;
        }
    }
}



//Code : Character Pattern

//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//A
//BC
//CDE
//DEFG

//Input format :
//Integer N (Total no. of rows)

//Output format :
//Pattern in N lines

//Constraints
//0 <= N <= 13

//Sample Input 1:
//5

//Sample Output 1:
//A
//BC
//CDE
//DEFG
//EFGHI

//Sample Input 2:
//6

//Sample Output 2:
//A
//BC
//CDE
//DEFG
//EFGHI
//FGHIJK