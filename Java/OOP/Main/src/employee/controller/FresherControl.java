package employee.controller;

import employee.controller.utils.ReadWriteFile;
import employee.model.Fresher;

import java.util.ArrayList;
import java.util.List;

public class FresherControl {
    private static final String FRESH_PATH = "src/employee/data/FresherList.csv";
    private static List<Fresher> fresherList = new ArrayList<>();
    public static List<Fresher> findAll() {
        List<Fresher> list = new ArrayList<>();
        List<String> lines = ReadWriteFile.readFile(FRESH_PATH);
        for (String item : lines) {
            list.add(Fresher.parseFresher(item));
        }
        return list;
    }

    public static void addFresher(Fresher fresher) {
        fresherList.add(fresher);
    }

}
