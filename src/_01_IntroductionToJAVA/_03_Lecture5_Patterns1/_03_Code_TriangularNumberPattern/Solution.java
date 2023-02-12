package _01_IntroductionToJAVA._03_Lecture5_Patterns1._03_Code_TriangularNumberPattern;

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
            while(currCol <= currRow) {

                System.out.print(currRow);
                currCol += 1;
            }
            System.out.println();
            currRow += 1;
        }
    }
}


//Code : Triangle Number Pattern

//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//1
//22
//333
//4444

//Input format :
//Integer N (Total no. of rows)

//Output format :
//Pattern in N lines

//Constraints
//0 <= N <= 50

//Sample Input 1:
//5

//Sample Output 1:
//1
//22
//333
//4444
//55555

//Sample Input 2:
//6

//Sample Output 2:
//1
//22
//333
//4444
//55555
//666666