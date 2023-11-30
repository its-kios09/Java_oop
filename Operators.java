public class Operators {
//    Operators are used to perform operation on variables and values
    public static void main(String [] args ){
//        declaring the variables
        int a = 2;
        int b = 6;
        int c = 0;

//   Arithmetic operator
        c = a + b;
        System.out.println("Classifying of Operators:-");
        System.out.println("Arithmetic Operation (Addition):- "+ c);

        c = a * b;
        System.out.println("Arithmetic Operation (Multiplication):- "+ c);

        c = a - b;
        System.out.println("Arithmetic Operation (Subtraction):- "+ c);

        c = b / a;
        System.out.println("Arithmetic Operation (Division):- "+ c + "\n");


//  Concatenating strings using (+)
        String welcome = "Welcome to Java World, ";
        String learner = "I'm Learning Java programming with object oriented";
        System.out.println(welcome + learner + '\n');

//  The unary operators require only one operand
        int x = 2;
        x++;
        System.out.println("Incrementing:- " + x);
        x--;
        System.out.println("Decrementing:- " + x);
    }
}
