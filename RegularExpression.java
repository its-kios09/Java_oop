import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args){
//        (.) matches any character (/w) - any a-z or 0-9
        String regex = "\\w";
        String text = "3";
        Pattern pt = Pattern.compile(regex);
        Matcher mt = pt.matcher(text);

        boolean results_of_expression = mt.matches();
        System.out.println("Result:- " + results_of_expression);
    }
}
