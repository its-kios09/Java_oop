public class IfElseConditions {
/* The if statements are executed from the top down. As soon as one of the
conditions controlling the if is true, the statement associated with that if is
executed, and the rest of the ladder is bypassed*/

    public static void main(String[] args){
        int month = 4;
        String season;

        if(month == 12 || month == 1 || month == 2)
            season = "Winter";
        else if(month == 3 || month == 4 || month == 5)
            season = "Spring";
        else if(month == 6 || month == 7 || month == 8)
            season = "Autum";
        else
            season = "Bogus month";

        System.out.println("Apirl is in the " + season + ".");
    }

}
