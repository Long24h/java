package employee.view;

import employee.model.IScanner;

public class AddEmployeeView implements IScanner {
    public void addEmp() {
        boolean flag = false;
        do {
            try {
                System.out.println("Choose type of employee");
                System.out.println("***********************");
                System.out.println("1. Experience");
                System.out.println("2. Fresher");
                System.out.println("3. Intern");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        AddExpView addExpView = new AddExpView();
                        addExpView.addExp();
                        break;
                    case 2:
                        AddFresherView addFresherView = new AddFresherView();
                        addFresherView.addFresher();
                        break;
                    case 3:
                        AddInternView addInternView = new AddInternView();
                        addInternView.addIntern();
                        break;
                    default:
                        flag = true;
                        break;
                }
            } catch (NumberFormatException n) {
                flag = true;
                n.printStackTrace();
            }
        }while (flag);
    }
}
