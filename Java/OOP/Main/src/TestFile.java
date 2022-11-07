import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class TestFile {
    public void makeFile() {
        try{
            FileWriter file = new FileWriter("data//testFile.txt");
            file.write(42);
            file.close();
        }catch(Exception e){
            System.err.println("error message");
        }
        System.out.println("simple message");
    }
    public void writeDataWithAutoClose() throws Exception{
        File file = new File("score.txt");
        if (file.exists()) {
            System.out.println("File exists!");
            System.exit(0);
        }
        try(PrintWriter output = new PrintWriter(file)){
            output.println("aloooooooo");
            output.println(325);
            output.println("gegue");
            output.println(23);
        }
    }
}
