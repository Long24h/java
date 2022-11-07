import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ReadFileExample {
    public void readFileTest() {
        try {
            File file = new File("score.txt");
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Sum: " + sum);
        }catch (Exception e){
            System.err.println("Wrong file!");
        }
    }
}
