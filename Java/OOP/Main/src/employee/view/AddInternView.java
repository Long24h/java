package employee.view;

import employee.controller.InternControl;
import employee.model.IScanner;
import employee.model.Intern;
import employee.model.Semester;
import employee.model.Type;

public class AddInternView implements IScanner {
    public void addIntern() {
        System.out.println("Enter intern's employee full name:");
        String name = scanner.nextLine();

        System.out.println("Enter intern's employee birthday (dd-MM-yyy):");
        String dob = scanner.nextLine();

        System.out.println("Enter intern's employee phone number:");
        String phone = scanner.nextLine();

        System.out.println("Enter intern's employee email address:");
        String email = scanner.nextLine();

        System.out.println("Enter intern's employee majors:");
        String majors = scanner.nextLine();

        System.out.println("Enter intern's employee semester:");
        Semester semester = null;
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                semester = Semester.FIRST;
                break;
            case 2:
                semester = Semester.SECOND;
                break;
            default:
                break;
        }

        System.out.println("Enter intern's employee university's name:");
        String uniName = scanner.nextLine();

        Intern intern = new Intern(name, dob, phone, email, Type.INTERN, majors, semester, uniName);

        InternControl.addIntern(intern);
    }
}
