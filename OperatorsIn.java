import java.util.Scanner;

public class OperatorsIn {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your first number:- ");
        int a = scanner.nextInt();

        System.out.println("Your second number:- ");
        int b = scanner.nextInt();

        int c = 0;

        c = a + b;

        System.out.println("The sum of the two numbers is:- " + c);
    }
}
