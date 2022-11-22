package employee.controller;

import employee.model.Intern;

import java.util.ArrayList;
import java.util.List;

public class InternControl {
    private static List<Intern> internList = new ArrayList<>();

    public static void addIntern(Intern intern) {
        internList.add(intern);
    }
}
