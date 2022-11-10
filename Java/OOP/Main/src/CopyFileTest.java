import java.io.*;

public class CopyFileTest {
    public void copyFile(String filePath) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        File newFile = new File("data//target");
        if (newFile.exists()) {
            System.exit(0);
        }
        FileWriter fw = new FileWriter(newFile);
        BufferedWriter bw = new BufferedWriter(fw);

        String line = "";
        while ((line = br.readLine()) != null) {
            bw.write(line);
        }
        br.close();
        bw.close();
    }
    public String createFile() throws IOException {
        File direction = new File("data");
        direction.mkdirs();
        File file = new File(direction, "sourceFile");
        if (!file.exists()) {
            System.out.println("File not found!");
//            System.exit(0);
        }
        FileWriter fr = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fr);
        bw.write("brb");
        bw.write("j5tjy");
        bw.write("agev");
        bw.close();
        String path = file.getAbsolutePath();
        return path;
    }
}
