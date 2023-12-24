import java.util.Scanner;

public class AccessModifiers_1 {
    public static void main(String[] args){
//        Default access modifiers
        AccessModifiers time = new AccessModifiers();

        int hours = time.hours;
        int minutes = time.minutes;

        System.out.println("The time is:- " + hours + " Hrs " + minutes+ " Mins");

//        Public access modifiers
        System.out.print("What is your name:- ");
        Scanner name = new Scanner(System.in);
        time.name = name.nextLine();
        String student = time.name;
        System.out.println("Your name is:-" + student);

//        Private access modifiers makes the variables or the data access on this file only to avoid assigning of new values on particular variables

//        Protected access modifiers only gives access when the files are on the same folder
        System.out.print("Enter the number of the days of the week:- ");
        Scanner day = new Scanner(System.in);
        time.days = day.nextInt();
        int no_of_weekday = time.days;
        switch (no_of_weekday){
            case 1:
                System.out.print("Monday");
                break;
            case 2:
                System.out.print("Tuesday");
                break;
            case 3:
                System.out.print("Wednesday");
                break;
            case 4:
                System.out.print("Thursday");
                break;
            case 5:
                System.out.print("Friday");
                break;
            case 6:
                System.out.print("Saturday");
                break;
            case 7:
                System.out.print("Sunday");
                break;
            default:
                System.out.print("Week has only 7 days");
        }

// N/B all methods should be always public compared to variables
    }
}
