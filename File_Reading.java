import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class File_Reading 
{
    public static void main(String[] args) 
    {
        try 
        {
            BufferedWriter pen = new BufferedWriter(new FileWriter("Unknown.java",true));
            pen.write("int num=7");
            pen.newLine();
            pen.write("int num2=14");
            pen.newLine();
            pen.write("System.out.println(num+num2)");
            pen.newLine();
            pen.newLine();
            pen.write("}}"); 
            pen.close();   
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }    
}
