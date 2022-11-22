package employee.view;

import employee.controller.FresherControl;
import employee.model.Fresher;
import employee.model.IScanner;
import employee.model.Rank;
import employee.model.Type;

public class AddFresherView implements IScanner {
    public void addFresher() {
        System.out.println("Enter fresher's full name:");
        String name = scanner.nextLine();

        System.out.println("Enter fresher's birthday (dd-mm-yyy):");
        String dob = scanner.nextLine();

        System.out.println("Enter fresher's employee phone number:");
        String phone = scanner.nextLine();

        System.out.println("Enter fresher's employee email address:");
        String email = scanner.nextLine();

        System.out.println("Enter fresher's employee graduation date (MM-yyy):");
        String graduation = scanner.nextLine();

        System.out.println("Enter fresher's employee rank of graduation:");
        Rank rank = null;
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("EXCELLENCE");
                rank = Rank.EXCELLENCE;
                break;
            case 2:
                System.out.println("GOOD");
                rank = Rank.GOOD;
                break;
            case 3:
                System.out.println("MEDIUM");
                rank = Rank.MEDIUM;
                break;
            default:
                break;
        }

        System.out.println("Enter fresher's employee graduation:");
        String nameGra = scanner.nextLine();

        Fresher fresher = new Fresher(name, dob, phone, email, Type.FRESHER, graduation, nameGra, rank);

        FresherControl.addFresher(fresher);
    }
}
