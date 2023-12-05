public class ProjectOne {
//    implements a very simple help system for Java’s selection and iteration statements
    public static void main(String[] args) throws java.io.IOException{
        char choice;
        do{
          System.out.println("Help on:- ");
          System.out.println(" 1. If Statements");
          System.out.println(" 2. Switch Selection");
          System.out.println(" 3. While loop");
          System.out.println(" 4. Do While loop");
          System.out.println(" 5. For loop\n");
          System.out.println(" 6. Choose:- ");
          choice = (char) System.in.read();

        }while( choice < '1'| choice > '5');

        switch (choice){
            case '1':
                System.out.println("The if:\n");
                System.out.println("if(condition) statement;");
                System.out.println("else statement");
                break;
            case '2':
                System.out.println("The switch:\n");
                System.out.println("switch(expression){");
                System.out.println("case constant: ");
                System.out.println("statement sequence");
                System.out.println("//.....");
                System.out.println("}");
                break;
            case '3':
                System.out.println("The While:- \n");
                System.out.println("while(condition) statement; ");
                break;
            case '4':
                System.out.println("The do-while: \n");
                System.out.println("do {");
                System.out.println(" statement;");
                System.out.println("} while(condition);");
                break;
            case '5':
                System.out.println("The for loop\n");
                System.out.println("for(init; condition; iteration)");
                System.out.println(" statement;");
                break;
        }

    }
}
