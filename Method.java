public class Method {
    public static int minFunction(int n1, int n2){
        int min;
        if(n1 >n2){
            min = n2;
        }else {
            min = n1;
        }
        return min;
    }

    public static void main(String[] args){
        int a = 2;
        int b =4;
        int c = minFunction(a,b);
        System.out.println("The minimum value is:- " + c);
    }
}
