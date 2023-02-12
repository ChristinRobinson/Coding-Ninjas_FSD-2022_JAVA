package _01_IntroductionToJAVA._04_Lecture6_Patterns2.Assignment._04_OddSquare;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Write your code here

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int currRow = 1;
        while(currRow <= n) {

            int valueToPrint = (2 * currRow - 1);
            int currCol = n;
            while(currCol > 0) {
                System.out.print(valueToPrint);
                valueToPrint += 2;

                if(valueToPrint > (2 * n) - 1) {
                    valueToPrint = 1;
                }

                currCol -= 1;
            }

            System.out.println();
            currRow += 1;
        }
    }
}


//Odd Square

//Write a program to print the pattern for the given N number of rows.
//For N = 4
//1357
//3571
//5713
//7135


//Input Format :
//A single integer: N

//Output Format :
//Required Pattern

//Constraints :
//0 <= N <= 50


//Sample Input 1 :
//3

//Sample Output 1 :
//135
//351
//513

//Sample Input 2 :
// 5

//Sample Output 2 :
//13579
//35791
//57913
//79135
//91357