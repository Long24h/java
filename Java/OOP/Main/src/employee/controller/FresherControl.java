package employee.controller;

import employee.model.Fresher;

import java.util.ArrayList;
import java.util.List;

public class FresherControl {
    private static List<Fresher> fresherList = new ArrayList<>();

    public static void addFresher(Fresher fresher) {
        fresherList.add(fresher);
    }
}
