import java.io.*;

public class JavaIO {
//    Operations:- Reading and write txt files
    public static void main(String [] args){
        try {
//          Writing the file
            BufferedWriter bw = new BufferedWriter(new FileWriter("text.txt"));
            bw.write("Software developer is the way!");
            bw.close();
//          Reading the file
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
            String line = br.readLine();
            System.out.println(line);
            br.close();
        } catch (IOException e) {
            System.out.println("File corrupted: " + e.getMessage());
        }
    }
}
