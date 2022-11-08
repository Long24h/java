package product.productview.functionview.allsearchproductsview;

import product.productview.ProductTemplate;

public class SearchProductByEntryPriceView extends ProductTemplate {
    public SearchProductByEntryPriceView() {

    }

    @Override
    protected void showBody() {
        boolean flag = false;
        int entryPrice;

        do {
            try {
                System.out.println("Enter product's entry price to search:");
                entryPrice = Integer.parseInt(scanner.nextLine());

                if (productManagement.searchEntryPrice(entryPrice) == null) {
                    System.out.printf("There is no product with entry price = %s \n", entryPrice);
                } else {
                    showProduct(productManagement.searchEntryPrice(entryPrice));
                }
            } catch (NumberFormatException numberFormatException) {
                System.err.println("Invalid input, try again!");
                flag = true;
            }
        } while (flag);
    }
}
