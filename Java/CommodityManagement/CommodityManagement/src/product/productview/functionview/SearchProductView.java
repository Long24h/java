package product.productview.functionview;

import product.productview.ProductTemplate;
import product.productview.functionview.allsearchproductsview.*;

public class SearchProductView extends ProductTemplate {
    public SearchProductView() {

    }

    @Override
    protected void showBody() {
        boolean flag = true;
        do {
            System.out.println("Get product by:");
            System.out.println("1. ID:");
            System.out.println("2. Name:");
            System.out.println("3. Price:");
            System.out.println("4. Inventory:");
            System.out.println("5. Unit:");
            System.out.println("6. Supplier:");
            System.out.println("0. Exit!");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    SearchProductByIdView searchProductByIdView = new SearchProductByIdView();
                    break;
                case 2:
                    SearchProductByNameView searchProductByNameView = new SearchProductByNameView();
                    break;
                case 3:
                    SearchProductByEntryPriceView searchProductByEntryPriceView = new SearchProductByEntryPriceView();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0:
                    flag = false;
                    break;
            }
        } while (flag == true);
    }
}
