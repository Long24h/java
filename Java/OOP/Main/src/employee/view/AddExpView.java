package employee.view;

import employee.controller.ExperienceControl;
import employee.model.Experience;
import employee.model.IScanner;
import employee.model.Type;

public class AddExpView implements IScanner {
    public void addExp() {
        System.out.println("Enter experience's employee full name:");
        String name = scanner.nextLine();

        System.out.println("Enter experience's employee birthday (dd-MM-yyy):");
        String dob = scanner.nextLine();

        System.out.println("Enter experience's employee phone number:");
        String phone = scanner.nextLine();

        System.out.println("Enter experience's employee email address:");
        String email = scanner.nextLine();

        System.out.println("Enter experience's employee year experience:");
        int exp = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter experience's employee pro skill:");
        String pro = scanner.nextLine();

        Experience experience = new Experience(name, dob, phone, email, Type.EXPERIENCE, exp, pro);

        ExperienceControl.addExp(experience);
    }
}
