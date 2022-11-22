package employee.view;

import employee.model.IScanner;
import employee.model.Type;

public class AddEmployeeView implements IScanner {
    public void addEmp() {
        System.out.println("Enter type of employee");
        Type type = Type.valueOf(scanner.nextLine().toUpperCase());

        switch (type) {
            case EXPERIENCE:
                AddExpView addExpView = new AddExpView();
                addExpView.addExp();
                break;
            case FRESHER:
                AddFresherView addFresherView = new AddFresherView();
                addFresherView.addFresher();
                break;
            case INTERN:
                AddInternView addInternView = new AddInternView();
                addInternView.addIntern();
                break;
            default:
                break;
        }
    }
}
