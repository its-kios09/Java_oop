package OOP;

class Box{
    double width;
    double height;
    double depth;
}
public class BoxDemo {
    public static void main(String[] args){
//        initializing the class
        Box mybox = new Box();
        double vol_of_box_one;
        double vol_of_box_two;


        mybox.width = 13.5;
        mybox.height = 14.4;
        mybox.depth = 5;

        vol_of_box_one = mybox.width * mybox.height * mybox.height;

//        Assigning the second box new values
        mybox.depth = 2;
        mybox.height = 3;
        mybox.width = 5;

        vol_of_box_two = mybox.depth * mybox.height * mybox.width;

        System.out.println("the volume of the first box is:- " + vol_of_box_one);
        System.out.println("the volume of the second box is:- " + vol_of_box_two);
    }
}
