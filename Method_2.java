public class Method_2 {
    public static void main(String[] args){
        int a = 34;
        int b = 67;

        System.out.println("<<<<<<<<<<<Swapping started>>>>>>>>>>>>\n");
        System.out.println("<<<<<<<<<<< Before Swapping value of a is:- " + a + " value of b:- " + b +" >>>>>>>>>>>>\n");
        swappingFunction(a, b);

    }
    public static void swappingFunction(int a, int b){
        int c = a;
        a = b;
        b = c;
        System.out.println("<<<<<<<<<<<Swapping finished>>>>>>>>>>>>\n");
        System.out.println("<<<<<<<<<<< After Swapping value of a is:- " + a + " value of b:- " + b +" >>>>>>>>>>>>");
    }
}
