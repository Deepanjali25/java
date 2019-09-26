package Hackerrank.Java;

import java.util.Scanner;

public class JavaEndofFile {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int lineNum = 1;
        while (userInput.hasNextLine() == true) {
            if (userInput.hasNext() == true) {
                System.out.println(lineNum + " " + userInput.nextLine());
                lineNum++;
            }
        }
    }
}
