import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name:- ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
