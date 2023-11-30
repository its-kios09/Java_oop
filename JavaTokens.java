public class JavaTokens {
//    token is the smallest element in a java program
//    which they can be as classified:- Keywords, Identifiers, constants, Special symbols and operators
    public static void main(String[] args){
//        Type casting is when you assign a value of one primitive data type to another type.
//        Implicit data type conversion(wide type casting)
        int a = 100;
//        Am using inline variable. - Syntax:- (keyword) variable_name
        System.out.println("Implicit data type conversion(wide type casting)");
        System.out.println("int representation is: "+ a);
        System.out.println("long representation is: "+ (long) a);
        System.out.println("float representation is:"+ (float) a + "\n");

//        Explicit data type conversion(Narrow Type Casing)
        double x = 10.34;
        System.out.println("Explicit data type conversion(wide type casting)");
        System.out.println("double representation is: "+ x);
        System.out.println("float representation is: "+ (float) x);
        System.out.println("int representation is:"+ (int) x);



    }
}
