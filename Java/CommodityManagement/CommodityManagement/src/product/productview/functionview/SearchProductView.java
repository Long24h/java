package product.productview.functionview;

import product.productview.ProductTemplate;
import product.productview.functionview.allsearchproductsview.*;

public class SearchProductView extends ProductTemplate {
    public static final int searchId = 1;
    public static final int searchName = 2;
    public static final int searchInvention = 3;
    public static final int searchUnit = 4;
    public static final int searchEntryPrice = 5;
    public static final int searchSupplire = 6;
    public static final int exit = 0;

    public SearchProductView() {

    }

    @Override
    protected void showBody() {
        boolean flag = true;
        do {
            menuSearchView();
//            try {
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case searchId:
                    SearchProductByIdView searchProductByIdView = new SearchProductByIdView();
                    break;
                case searchName:
                    SearchProductByNameView searchProductByNameView = new SearchProductByNameView();
                    break;
                case searchInvention:
                    SearchProductByInventoryView searchProductByInventoryView = new SearchProductByInventoryView();
                    break;
                case searchUnit:
                    SearchProductByUnitView searchProductByUnitView = new SearchProductByUnitView();
                    break;
                case searchEntryPrice:
                    SearchProductByEntryPriceView searchProductByEntryPriceView = new SearchProductByEntryPriceView();
                    break;
                case searchSupplire:
                    SearchProductBySupplierView searchProductBySupplierView = new SearchProductBySupplierView();
                    break;
                case exit:
                    flag = false;
                    break;
                default:
                    System.out.println("Wrong input, enter again!");
                    break;
            }
//            }catch(Exception e){
//                System.out.println("Invalid! Please choose again!");
//            }


        } while (flag);
    }

    protected void menuSearchView() {
        System.out.println("Search product by:");
        System.out.println("------------------\n");
        System.out.println("1. ID:");
        System.out.println("2. Name:");
        System.out.println("3. Inventory:");
        System.out.println("4. Unit:");
        System.out.println("5. Entry Price:");
        System.out.println("6. Supplier:");
        System.out.println("0. Exit!");
        System.out.println("Enter your choice!");
        System.out.print("==> ");
    }
}
