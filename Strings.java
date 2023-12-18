public class Strings {
    public static void main(String[] args){
        char [] string = {'H', 'E', 'L', 'L', 'O'};
        String string_converted = new String(string);

        System.out.println(string_converted);

//    calculating the length of the string
        int length_of_the_string = string_converted.length();
        System.out.println("The length of the string is:- " + length_of_the_string);
    }
}
