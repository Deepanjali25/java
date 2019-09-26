package Hackerrank.Java;
import java.util.Scanner;
public class JavaStdinStdout {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num1 = scanner.nextInt();
            double num2 = scanner.nextDouble();
            scanner.nextLine();
            String str = scanner.nextLine();
            scanner.close();
            System.out.println("String: " + str);
            System.out.println("Double: " + num2);
            System.out.println("Int: " + num1);
    }
}
