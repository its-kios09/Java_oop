public class DoWhileLoop {
//      Each iteration of the do-while loop first executes the body of the loop and then
//      evaluates the conditional expression. If this expression is true, the loop will
//      repeat. Otherwise, the loop terminates.
    public static void main(String[] args){

        int i = 10;
        do{
            System.out.println("Do - While looping:- " + i);
            i--;
        }while (i > 0);
        
    }
}
