public class QuestionnaireOperator {
    // Ternary (three-way) operator that can replace certain types of if-then-else statements.
    // Syntax:- expression1 ? expression2 : expression3
    public static void main(String[] args) {
        int a = 1;
        String result = (0 < a) ? "Negative number" : "Positive number";
        System.out.println(result);
    }
}

