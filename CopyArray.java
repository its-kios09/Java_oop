public class CopyArray {
//    Copying the arrays into another array defined
    public static void main(String[] args){
        String [] CopyArrays = {
                "Francis",
                "Fredrick",
                "Benson",
                "James",
                "Christine",
                "David",
                "Sarah"
        };
//        Declaring another array to copy to
        String [] CopiedElements = new String[7];

//        Copying the arrays
//        Syntax of copying te arrays:-  System.arraycopy(firstArray, index of the first element, second array, index of the first element, index of the last element);
        System.arraycopy(CopyArrays, 0, CopiedElements,0,6);

//        Printing the arrays of the copied elements
        System.out.println("Printing the elements from the copied array");
        System.out.println(CopiedElements[1]);


    }
}
