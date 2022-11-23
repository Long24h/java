package employee.controller;

import employee.controller.utils.ReadWriteFile;
import employee.model.Experience;
import employee.model.Type;

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

    public Experience findById(long id) {
        List<Experience> list = findAll();
        for (Experience item : list) {
            if (item.getId() == id) {
                return item;
            }
        }
        throw new RuntimeException("Not find this experience employee!");
    }

    public void editName(long id, String newName) {
        findById(id).setFullName(newName);
        ReadWriteFile.writeFile(EXP_PATH, findAll());
    }
    public void editDOB(long id, String dob) {
        findById(id).setDob(dob);
        ReadWriteFile.writeFile(EXP_PATH, findAll());
    }
    public void editPhone(long id, String phone) {
        findById(id).setPhone(phone);
        ReadWriteFile.writeFile(EXP_PATH, findAll());
    }
    public void editEmail(long id, String email) {
        findById(id).setEmail(email);
        ReadWriteFile.writeFile(EXP_PATH, findAll());
    }
    public void editType(long id, Type type) {
        findById(id).setType(type);
        ReadWriteFile.writeFile(EXP_PATH, findAll());
    }
    public void editYearInExp(long id, int year) {
        findById(id).setExpInYear(year);
        ReadWriteFile.writeFile(EXP_PATH, findAll());
    }
    public void editProSkill(long id, String skill) {
        findById(id).setProSkill(skill);
        ReadWriteFile.writeFile(EXP_PATH, findAll());
    }
}
