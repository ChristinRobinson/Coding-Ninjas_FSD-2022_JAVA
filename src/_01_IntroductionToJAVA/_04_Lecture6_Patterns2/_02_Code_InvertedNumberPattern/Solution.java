package _01_IntroductionToJAVA._04_Lecture6_Patterns2._02_Code_InvertedNumberPattern;


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
            while(currCol <= (n - currRow + 1)) {

                System.out.print(n - currRow + 1);
                currCol += 1;
            }
            System.out.println();
            currRow += 1;
        }
    }
}



//Code : Inverted Number Pattern

//Print the following pattern for the given N number of rows.
//Pattern for N = 4
//4444
//333
//22
//1


//Input format :
//Integer N (Total no. of rows)

//Output format :
//Pattern in N lines

//Constraints :
//0 <= N <= 50


//Sample Input 1:
//5

//Sample Output 1:
//55555
//4444
//333
//22
//1

//Sample Input 2:
//6

//Sample Output 2:
//666666
//55555
//4444
//333
//22
//1