import java.io.*;
import java.util.*;

public class StudentFileExample {
    public static void main(String[] args) {

        
        ArrayList<String> students = new ArrayList<>();
        students.add("Arun");
        students.add("Priya");
        students.add("Rahul");
        students.add("Sneha");
        students.add("Kiran");

        
        String fileName = "students.txt";

        try {
            
            FileWriter writer = new FileWriter(fileName);

            for(String name : students){
                writer.write(name + "\n");
            }

            writer.close();
            System.out.println("Student names written to file successfully.");

           
            FileReader reader = new FileReader(fileName);
            BufferedReader br = new BufferedReader(reader);

            String line;
            System.out.println("\nReading from file:");

            while((line = br.readLine()) != null){
                System.out.println(line);
            }

            br.close();

        } catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}