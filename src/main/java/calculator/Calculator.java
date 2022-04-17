package calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private static final Logger logger = LogManager.getLogger(Calculator.class);
    private static final String LOG_FACT = "[FACTORIAL] - ";
    private static final String LOG_SQ = "[SQROOT] - ";
    private static final String LOG_POWER = "[POWER] - ";
    private static final String LOG_NLOG = "[NATURAL LOG] - ";
    private static final String LOG_RESULT = "[RESULT] - ";

    public Calculator() {
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("\nChoose Your Option");
            System.out.print("1 - Factorial\n2 - Square Root\n3 - Power\n4 - Natural Logarithm\n5 - exit\n");
            int option;
            try {
                option = scanner.nextInt();
            } catch (InputMismatchException error) {
                System.out.print("Unsupported Input");
                return;
            }
            switch (option) {
                case 1:
                    {
                        System.out.print("Enter your number : ");
                        long num, result = 1;
                        num = scanner.nextLong();
                        result = computeFactorial(num);
                        System.out.println("Result : " + result + "\n");
                    }
                    break;
                case 2:
                    {
                        System.out.print("Enter your number : ");
                        double num, result;
                        num = scanner.nextDouble();
                        result = computeSQ(num);
                        System.out.println("Result : " + result + "\n");
                    }
                    break;
                case 3:
                    {
                        double num1, num2, result;
                        System.out.print("Enter your first number : ");
                        num1 = scanner.nextDouble();
                        System.out.print("Enter your second number : ");
                        num2 = scanner.nextDouble();
                        result = computePower(num1, num2);
                        System.out.println("Result : " + result + "\n");
                    }
                    break;
                case 4:
                    {
                        System.out.print("Enter your number : ");
                        double num;
                        num = scanner.nextDouble();
                        double result;
                        result = computeLog(num);
                        System.out.println("Result : " + result + "\n");
                    }
                    break;
                default:
                    System.out.println("Thanks, Exiting Calculator...");
                    return;
            }
        }
    }

    public static long computeFactorial(long num) {
        long result = 1;
        logger.info(LOG_FACT + num);
        for (int i = 1; i <= num; i ++) {
            result *= i;
        }
        logger.info(LOG_RESULT + result);
        return result;
    }

    public static double computeSQ(double num) {
        logger.info(LOG_SQ + num);
        double result = Math.sqrt(num);
        logger.info(LOG_RESULT + result);
        return result;
    }

    public static double computePower(double num1, double num2) {
        logger.info(LOG_POWER + num1 + " " + num2);
        double result = Math.pow(num1, num2);
        logger.info(LOG_RESULT + result);
        return result;
    }

    public static double computeLog(double num) {
        logger.info(LOG_NLOG + num);
        double result;
        try {
            if (num < 0) {
                result = Double.NaN;
                System.out.println("Negative number not allowed");
            }
            else {
                result = Math.log(num);
            }
        } catch (ArithmeticException error) {
            result = Double.NaN;
            System.out.println("Invalid Input");                      
        }
        logger.info(LOG_RESULT + result);
        return result;
    }
}
