package employee.controller;

import employee.controller.utils.ReadWriteFile;
import employee.model.Experience;

import java.util.ArrayList;
import java.util.List;

public class ExperienceControl {
    private static final String EXP_PATH = "src/employee/data/ExperienceList.csv";
    private static final List<Experience> experienceList = new ArrayList<>();

    public static List<Experience> findAll() {
        List<Experience> list = new ArrayList<>();
        List<String> lines = ReadWriteFile.readFile(EXP_PATH);
        for (String item : lines) {
            list.add(Experience.parseExp(item));
        }
        return list;
    }

    public static void addExp(Experience experience) {
        List<Experience> list = findAll();
        list.add(experience);
        ReadWriteFile.writeFile(EXP_PATH, list);
    }

    public static void removeExp(Experience experience) {
        List<Experience> list = findAll();
        list.remove(experience);
        ReadWriteFile.writeFile(EXP_PATH, list);
    }
}
