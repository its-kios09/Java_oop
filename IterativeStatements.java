public class IterativeStatements {
//    Java’s iteration statements are for, while, and do-while
//    a loop repeatedly executes the same set of instructions until a termination condition is met.
    public static void main(String[] args){
        int n = 10;
        while(n > 0){
            System.out.println("tick tak:- " + n);
            n--; //decrementing
        }
        int i, j;
        i = 100;
        j = 200;
//        finding the midpoint of 100 and 200
        while(++i < --j);
        System.out.println("Midpoint is:- " + i);

    }
}

