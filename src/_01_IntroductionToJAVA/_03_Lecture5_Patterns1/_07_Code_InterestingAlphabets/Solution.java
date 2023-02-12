package _01_IntroductionToJAVA._03_Lecture5_Patterns1._07_Code_InterestingAlphabets;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        //Your code goes here

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int currRow = 1;
        while(currRow <= n) {

            int currCol = 1;
            char ch = (char) ('A' + n - currRow);
            while(currCol <= currRow) {

                System.out.print((char) (ch + currCol - 1));
                currCol += 1;
            }
            System.out.println();
            currRow += 1;
        }
    }
}

//Code : Interesting Alphabets

//Print the following pattern for the given number of rows.
//Pattern for N = 5
//E
//DE
//CDE
//BCDE
//ABCDE

//Input format :
//N (Total no. of rows)

//Output format :
//Pattern in N lines

//Constraints
//0 <= N <= 26

//Sample Input 1:
//8

//Sample Output 1:
//H
//GH
//FGH
//EFGH
//DEFGH
//CDEFGH
//BCDEFGH
//ABCDEFGH

//Sample Input 2:
//7

//Sample Output 2:
//G
//FG
//EFG
//DEFG
//CDEFG
//BCDEFG
//ABCDEFG