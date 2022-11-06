package product.productview.functionview;

import product.Product;
import product.productview.ProductTemplate;
import product.productview.functionview.allsort.*;
import product.productview.functionview.allsortproductview.SortProductByIdView;
import product.productview.functionview.allsortproductview.SortProductByNameView;


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
                    SortProductByIdView sortProductByIdView = new SortProductByIdView();
                    break;
                case 2:
                    SortProductByNameView sortProductByNameView = new SortProductByNameView();
                    break;
                case 3:
                    comparator = new ComparatorByUnit();
                    productManagement.sortProduct(comparator);
                    break;
                case 4:
                    comparator = new ComparatorByEntryPrice();
                    productManagement.sortProduct(comparator);
                    break;
                case 5:
                    comparator = new ComparatorBySupplier();
                    productManagement.sortProduct(comparator);
                    break;
                case 6:
                    comparator = new ComparatorByDateCreate();
                    productManagement.sortProduct(comparator);
                    break;
                case 7:
                    comparator = new ComparatorByDateUpdate();
                    productManagement.sortProduct(comparator);
                    break;
                case 0:
                    flag = false;
                    break;
            }
        } while (flag);
    }
}
