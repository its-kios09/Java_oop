import java.util.Objects;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your official name:- ");
        String name = scanner.nextLine();

        if(Objects.equals(name, "angie")){
            System.out.println("You have successfully logged in:- " + name);
        }else {
            System.out.println("Bad credentials Try Again.");
        }
    }
}
