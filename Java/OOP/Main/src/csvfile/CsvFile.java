package csvfile;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CsvFile {
    public CsvFile(){

    }
    public void listCountry(Country country) throws IOException {
        File file = new File("country.csv");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("country");
    }
}
