public class SwitchStatements {
    public static void main(String[] args){
        /*
        * The switch statement is Java’s multiway branch statement. It provides an easy
way to dispatch execution to different parts of your code based on the value of
an expression. As such, it often provides a better alternative than a large series
of if-else-if statements*/
// Syntax:- switch (expression) {
//case value1:
//// statement sequence
//break;
        int i = 0;
        for(i=0; i < 6; i++){
            switch (i){
                case 0:
                    System.out.println("I is zero");
                    break;
                case 1:
                    System.out.println("I is one");
                    break;
                case 2:
                    System.out.println("I is two");
                    break;
                case 3:
                    System.out.println("I is three");
                default:
                    System.out.println("The rest are greater than 3");
            }
        }
    }
}
