import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile() {
        List<Integer> numList = new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("score.txt"));
            String line = "";
            while ((line = br.readLine()) != null) {
                numList.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e) {
            System.err.println("Error!");
        }
        return numList;
    }

    public void writeFile(int max) {
        try {
            FileWriter writer = new FileWriter("score.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Max: " + max);
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
