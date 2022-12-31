import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String line = "";
        String splitBy = ",";

        try{
            BufferedReader br = new BufferedReader(new FileReader("names.csv"));
            while ((line = br.readLine() )!= null){
                String[] students = line.split(splitBy);
                System.out.println("Student First name = " + students[0] + ", Age=" + students[2] + ", address = " + students[3]);

            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
