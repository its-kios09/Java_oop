public class UsingBreak {
//By using break, you can force immediate termination of a loop, bypassing the
//conditional expression and any remaining code in the body of the loop.
    public static void main(String[] args){
        for(int i = 0; i < 100; i++ ){
            if(i == 10) break;
            System.out.println("i:- " + i);
        }
    }
}
