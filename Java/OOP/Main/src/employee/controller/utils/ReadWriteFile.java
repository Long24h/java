package employee.controller.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadWriteFile {
    public static <T> void writeFile(String filePath, List<T> list) {
        try {
            PrintWriter pw = new PrintWriter(filePath);
            for (T item : list) {
                pw.println(item.toString());
            }
            pw.close();
        } catch (FileNotFoundException f) {
            System.err.println("File not found, check it!");
        }
    }

    public static List<String> readFile(String filePath) {
        List<String> lines = new ArrayList<>();
        try {
            FileReader fr = new FileReader(filePath);
            BufferedReader br = new BufferedReader(fr);
            String line = "";
            if ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();
        } catch (FileNotFoundException f) {
            f.printStackTrace();
        } catch (IOException e) {
            System.err.println("IOException!");
        }
        return lines;
    }
}
