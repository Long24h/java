package product.productview.functionview;

import product.productview.ProductTemplate;

public class SortProductView extends ProductTemplate {
    public SortProductView() {

    }

    @Override
    protected void showBody() {
        boolean flag = true;
        do {
            System.out.println("What style of sort do you want?");
            System.out.println("1. Sort by ID:");
            System.out.println("2. Sort by name:");
            System.out.println("3. Sort by unit:");
            System.out.println("4. Sort by entry price:");
            System.out.println("5. Sort by supplier:");
            System.out.println("6. Sort by date create:");
            System.out.println("7. Sort by date update:");
            System.out.println("0. Exit!");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 0:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
