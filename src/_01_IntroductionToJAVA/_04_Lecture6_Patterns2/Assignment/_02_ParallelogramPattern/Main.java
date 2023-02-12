package _01_IntroductionToJAVA._04_Lecture6_Patterns2.Assignment._02_ParallelogramPattern;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Write your code here

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int currRow = 1;
        while(currRow <= n) {

            int space = 1;
            while(space <= currRow - 1) {

                System.out.print(" ");
                space += 1;
            }

            int currCol = 1;
            while(currCol <= n) {

                System.out.print("*");
                currCol += 1;
            }

            System.out.println();
            currRow += 1;
        }
    }
}


//Parallelogram Pattern

//Write a program to print parallelogram pattern for the given N number of rows.
//For N = 4
//*****
//.*****
//..*****
//...*****
//The dots represent spaces.


//Input Format :
// A single integer : N

//Output Format :
//Required Pattern

//Constraints :
//0 <= N <= 50


//Sample Input 1 :
//3

//Sample Output 1 :
//***
//.***
//..***

//Sample Input 2 :
//5

//Sample Output 2 :
//*****
//.*****
//..*****
//...*****
//....*****