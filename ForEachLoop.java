import java.util.Arrays;

public class ForEachLoop {
//        Syntax:- for(type itr-var : collection) statement-block
    public static void main(String[] args){
        int [] a = {1, 3, 4, 5, 6, 7, 8, 9, 20};
        int sum = 0;
        for(int x: a){
            System.out.println("The value of a is:- " + x);
            sum += x;
        }
        System.out.println("The Sum of elements is:- " + sum);
    }
}
