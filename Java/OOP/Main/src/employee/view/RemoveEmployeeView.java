package employee.view;

import employee.model.IScanner;

public class RemoveEmployeeView implements IScanner {
    public void removeEmp() {
        System.out.println("Enter employee's ID");
        long id = Long.parseLong(scanner.nextLine());
    }
}
