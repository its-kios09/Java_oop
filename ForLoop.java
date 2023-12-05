public class ForLoop {
    /*
    The for loop operates as follows. When the loop first starts, the
initialization portion of the loop is executed. Generally, this is an expression
that sets the value of the loop control variable, which acts as a counter that
controls the loop. It is important to understand that the initialization expression
is executed only once. Next, condition is evaluated.
     */

    public static void main(String[] args){
        int a;
        for(a = 0; a <= 10; a++){
            System.out.println("for looping x:- " + a);
        }

//        Declaring Loop Control Variables Inside the for Loop
        for (int i = 10; i > 0; i--){
            System.out.println("Inline Declaration of variable inside the for loop:- "+ i);
        }
    }
}
